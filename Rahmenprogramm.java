import java.util.Date;


public class Rahmenprogramm {

	private String bezeichnung;
	private Date datum;
	private String zeit;
	private String ort;
	
	public Rahmenprogramm(String bezeichnung, Date datum, String zeit, String ort) {
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.zeit = zeit;
		this.ort = ort;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	public Date getDatum() {
		return datum;
	}
	public String getZeit() {
		return zeit;
	}
	public String getOrt() {
		return ort;
	}
	
}
