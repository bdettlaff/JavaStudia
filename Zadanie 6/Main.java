import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	
          /*
          Napisz klase NrTelefoniczny, posiadajaca 2 pola: nrkierunkowy i nrTelefonu i implementujaca interfejs Comparable.
          Nastepnie utworz abstrakcyjna klase Wpis a nastepnie dziedziczace z niej klasy Osoba i Firma. 
          Klasa Wpis ma abstrakcyjna metode opis, ktora opisuje dany wpis. 
          Byc moze ma rowniez inne metody abstrakcyjne lub nie w miare potrzeb. 
          Klasa Osoba ma zawierac informacje o imieniu, nazwisku, adresie i (w tym nrTelefonu). 
          Klasa Firma ma miec nazwe i adres( w tym NrTelefonu). 
          Utworz kilka obiektow klasy Osoba i kilka obiektow klasy Firma i umiesc je w kontenerze TreeMap, 
          poslugujac sie jako kluczem numerem telefonicznym. 
          Nastepnie wypisz utworzona w ten sposob ksiazke telefoniczna za pomoca iteratora. 
          */

		Wpis osobaPierwsza = new Osoba("Bartek","Dettlaff","Ks.Popiełuszki 21", new NrTelefoniczny("44","507546055"));
		Wpis osobaDruga = new Osoba("Kamil","Jurek","Londynska 7", new NrTelefoniczny("42","665768312"));
		Wpis osobaTrzecia = new Osoba("Patryk","Gitner","Nosowska 78", new NrTelefoniczny("24","634754542"));
		Wpis firmaPierwsza = new Firma("Biedronka","Zwierzeca 32", new NrTelefoniczny("57", "504342341"));
		Wpis firmaDruga = new Firma("Microsoft","Informatycza 1", new NrTelefoniczny("56", "504327321"));
		
		TreeMap<NrTelefoniczny, Wpis> ksiazka = new TreeMap<NrTelefoniczny, Wpis>();
		
		ksiazka.put(osobaPierwsza.pobierzNrTelefoniczny(), osobaPierwsza);
		ksiazka.put(osobaDruga.pobierzNrTelefoniczny(), osobaDruga);
		ksiazka.put(osobaTrzecia.pobierzNrTelefoniczny(), osobaTrzecia);
        ksiazka.put(firmaPierwsza.pobierzNrTelefoniczny(), firmaPierwsza);
        ksiazka.put(firmaDruga.pobierzNrTelefoniczny(), firmaDruga);
		
		for(Map.Entry<NrTelefoniczny, Wpis> map: ksiazka.entrySet()) {
				map.getValue().opis();
		}
	}
}
