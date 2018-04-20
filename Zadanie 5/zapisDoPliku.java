import java.io.*;

public class zapisDoPliku {
	
	public void zapisz(Vector wektor) throws IOException {
		
		String wynik = new String();
		
		try(FileWriter wyjscie = new FileWriter("wynik.txt")){
			for(int i=0;i<wektor.lista.size();i++) {
				
				if(wektor.lista.size()==1)
				{
					wynik = wynik + "[";
					wynik = wynik + wektor.lista.get(i);
					wynik = wynik + "]";
				}
				else if(i==0) {
					wynik = wynik + "[";
					wynik = wynik + wektor.lista.get(i);
					wynik = wynik + ",";
				}
				else if(i==(wektor.lista.size()-1)) {
					wynik = wynik + wektor.lista.get(i);
					wynik = wynik + "]";
				}
				else {
					wynik = wynik + wektor.lista.get(i);
					wynik = wynik + ",";
				}
				
			}
			
			wyjscie.write(wynik);
		}
	}
}
