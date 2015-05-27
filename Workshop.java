import java.util.ArrayList;
import java.util.Date;

public class Workshop {

	private int nummer;
	private String bezeichnung;
	private Date datum;
	private String referent;
	private ArrayList<String> teilnehmer;
	
	public Workshop(int nummer, String bezeichnung, Date datum, String referent) {
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.referent = referent;
	}
	
	public String getReferent() {
		return referent;
	}

	public Date getDatum() {
		return datum;
	}
	public int getNummer() {
		return nummer;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public void addTeilnehmer(String teilnehmer){
		this.teilnehmer.add(teilnehmer);
	}
	
}
