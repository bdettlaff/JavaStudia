
public class NrTelefoniczny implements Comparable<NrTelefoniczny>{
	  private String nrKierunkowy;
	  private String nrTelefonu;
	
	
	public NrTelefoniczny(String nrKierunkowy, String nrTelefonu) {
		this.nrKierunkowy=nrKierunkowy;
		this.nrTelefonu=nrTelefonu;
	}
	
	@Override
	public int compareTo(NrTelefoniczny o) {
		return nrTelefonu.compareTo(o.nrTelefonu);
	}
	
	@Override
	public String toString() {
		return "+" + nrKierunkowy + " " + nrTelefonu;
	}
	
}
