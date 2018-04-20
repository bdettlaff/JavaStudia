
public class Firma extends Wpis{
	private String nazwa;
	private String adres; 
	private NrTelefoniczny nrTelefoniczny;
	
	
	public Firma(String nazwa, String adres, NrTelefoniczny nrTelefoniczny) {
		this.nazwa = nazwa;
		this.adres = adres;
	    this.nrTelefoniczny = nrTelefoniczny;
	}
	@Override
	public void opis() {
		System.out.println("NAZWA: " + this.nazwa + 
						   " ADRES: " + this.adres + 
				           " Nr Telefonu: " + this.nrTelefoniczny);
	}
	
	@Override
	public NrTelefoniczny pobierzNrTelefoniczny(){
		return nrTelefoniczny;
	}
}
