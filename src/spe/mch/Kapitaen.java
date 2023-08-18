package spe.mch;

public class Kapitaen {
	private String vorname;
	private String nachname;
	
	public Kapitaen(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public Kapitaen() {
		this("N.N.", "N.N.");
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	@Override
	public String toString() {
		return "Kapitän  [" + vorname + " " + nachname + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
