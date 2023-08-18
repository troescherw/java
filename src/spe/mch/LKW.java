package spe.mch;

public class LKW extends Fahrzeug implements Motorgetrieben{
	// Attribute
	private int aktuelleLadung;
	private int maxLadung;
	
	// Konstruktoren
	public LKW() {}
	
	public LKW(String hersteller, String farbe, int alter, double gewicht, int maxLadung) {
		super(hersteller, farbe, alter, gewicht);
		this.maxLadung = maxLadung;
	}
	

	public int getAktuelleLadung() {
		return aktuelleLadung;
	}
	
	public void setAktuelleLadung(int aktuelleLadung) {
		if(this.maxLadung >= aktuelleLadung) {
			this.aktuelleLadung = aktuelleLadung;
		}
	}
	
	public int getMaxLadung() {
		return maxLadung;
	}
	public void setMaxLadung(int maxLadung) {
		this.maxLadung = maxLadung;
	}


	
	// Implementierung der abstrakten Methoden
	@Override
	public void fahren() {
		System.out.println("LKW fährt mit Diesel und verpestet die Umwelt.");
		
	}

	@Override
	public void bremsen() {
		System.out.println("LKW bremst mit hydraulischem Bremssystem.");
		
	}
	
	public void entladen() {
		this.aktuelleLadung=0;
		System.out.println("LKW wurde entladen");
	}
	
	public void beladen(int ladung) {
		if(this.aktuelleLadung+ladung<=this.maxLadung) {
			this.aktuelleLadung += ladung;
		} else {
			this.aktuelleLadung = this.maxLadung;
		}
		
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Max. Ladung=" + this.maxLadung +
				"kg,aktuelle Ladung=" + this.aktuelleLadung + "kg";
	}

	@Override
	public void tanken() {
		System.out.println("LKW wird mit Diesel betankt.");
		
	}

	@Override
	public void motorWarten() {
		System.out.println("LKW-Motor wird bei einer Hersteller-Werkstatt gewartet.");
	}
	
	
	
	
	
	
	

}
