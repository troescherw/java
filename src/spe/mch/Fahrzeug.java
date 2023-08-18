package spe.mch;

public abstract class Fahrzeug {
	// Attribute
	private String hersteller;
	private String farbe;
	private int alter;
	private double gewicht;

	// Konstruktor
	public Fahrzeug() {
		super();
	}
	
	// Konstruktor mit Argumenten
	public Fahrzeug(String hersteller, String farbe, int alter, double gewicht) {
		this.hersteller = hersteller;
		this.farbe = farbe;
		this.alter = alter;
		this.gewicht = gewicht;
	}
	
	// Getter und Setter
	
	public String getHersteller() {
		return hersteller;
	}
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public double getGewicht() {
		return gewicht;
	}
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
	// Abstrakte Methoden
	public abstract void fahren();
	public abstract void bremsen();
	
	// Überschrieben von Object
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ":" + " Hersteller=" + this.hersteller +
				", Farbe=" + this.farbe + ", Alter=" + this.alter + " Jahre" + 
				", Gewicht=" + this.gewicht + "kg";
	}
	

}
