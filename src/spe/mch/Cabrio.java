package spe.mch;

public class Cabrio extends Auto{
	
	private boolean dachOffen;
	
	
	public Cabrio() {}
	
	public Cabrio(String hersteller, String farbe, int alter, double gewicht, int anzahlPlaetze) {
		super(hersteller, farbe, alter, gewicht, anzahlPlaetze);
	}
	
	

	public boolean isDachOffen() {
		return dachOffen;
	}

	public void setDachOffen(boolean dachOffen) {
		this.dachOffen = dachOffen;
	}
	
	public void dachBewegen() {
		this.dachOffen = !this.dachOffen;
		
	}
	
	@Override
	public String toString() {
		// Verwendung des Konditionaloperators:  Bedingung ? True-Fall : False-Fall
		return super.toString() + (dachOffen ? ", Dach ist offen" : ", Dach ist geschlossen");
	}
	
	

}
