
public class Osoba extends Wpis{
	private String imie;
	private String nazwisko;
	private String adres; 
	private NrTelefoniczny nrTelefoniczny;
	
	public Osoba(String imie, String nazwisko, String adres, NrTelefoniczny nrTelefoniczny) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
	    this.nrTelefoniczny = nrTelefoniczny;
	}
	
	@Override
	public void opis() {
		System.out.println("IMIE: " + this.imie +
						   " NAZWISKO: "+ this.nazwisko + 
						   " ADRES: " + this.adres + 
						   " Nr Telefonu: " + this.nrTelefoniczny);
	}
	@Override
	public NrTelefoniczny pobierzNrTelefoniczny(){
		return nrTelefoniczny;
	}
}
