import java.io.IOException;

public class zadanie {

	public static void main(String[] args) throws IOException {
        /* ZADANIE 5
         Napisz program proszacy o podanie 2 wektorow.
         Koniec wektora oznacza sie za pomoca wcisniecia klawisza enter. 
         Jezeli podany ciag nie jest liczba, jest ignorowany. 
         Nastepnie nalezy sprobowac dodac wektory, jezeli sa rownej dlugosci. 
         Jezeli nie, sa, rzucany jest wlasny wyjatek WektoryRoznejDlugosciException, 
         za pomoca ktorego mozna podac a nastepnie odczytac dlugosci tych wektorow.
         Jezeli sa rownej dlugosci, wynik dodawania zapisywany jest do pliku. 
         Jezeli nie sa rownej dlugosci, uzytkownik jest proszony o ponowne wprowadzenie tych wektorow. 
        */		


		Vector wektorPierwszy = new Vector();
		Vector wektorDrugi = new Vector();
		Vector wynik = new Vector();
		zapisDoPliku zapis = new zapisDoPliku();
		
		boolean flagaGlownegoProgramu=true;
		
		while(flagaGlownegoProgramu==true)
		{
			wektorPierwszy.dodajDane();
			wektorDrugi.dodajDane();
			
			wektorPierwszy.czyUzytecznyWektor(wektorDrugi);
			wektorDrugi.czyUzytecznyWektor(wektorPierwszy);
		
			try {
				if(wektorPierwszy.lista.size()!=wektorDrugi.lista.size()) {
					throw new WektoryRoznejDlugosciException();
				}
				wynik.dodajVectory(wynik, wektorPierwszy.lista, wektorDrugi.lista);
				wynik.wypiszDane();
				flagaGlownegoProgramu=false;
				zapis.zapisz(wynik);
			
			}
			catch(WektoryRoznejDlugosciException e) {
				wektorPierwszy.lista.removeAll(wektorPierwszy.lista);
				wektorDrugi.lista.removeAll(wektorDrugi.lista);
			}
		}
	}
}
