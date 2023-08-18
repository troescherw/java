package spe.mch;

public class Auto extends Fahrzeug implements Motorgetrieben{
	private int anzahlPlaetze;
	
	public Auto() {
		super();
	}
	
	public Auto(String hersteller, String farbe, int alter, double gewicht, int anzahlPlaetze) {
		super(hersteller, farbe, alter, gewicht);
		this.anzahlPlaetze = anzahlPlaetze;
	}
	

	public int getAnzahlPlaetze() {
		return anzahlPlaetze;
	}

	public void setAnzahlPlaetze(int anzahlPlaetze) {
		this.anzahlPlaetze = anzahlPlaetze;
	}

	@Override
	public void fahren() {
		System.out.println("Auto fährt mit Kraftstoff.");
		
	}

	@Override
	public void bremsen() {
		System.out.println("Auto bremst mit Schreibenbremse.");
		
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Anzahl Plätze=" + this.anzahlPlaetze;
		
	}
	
	@Override
	public void motorWarten() {
		System.out.println("Auto-Motor wird von der Werkstatt gewartet.");
	}
	
	@Override
	public void tanken() {
		System.out.println("Auto wird mit Benzin oder Diesel betankt.");
	}

}
