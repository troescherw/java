package spe.mch;

public class Schiff extends Fahrzeug{
	
	// Attribut
	private Kapitaen kapitaen;
	
	public Schiff() {}

	public Schiff(String hersteller, String farbe, int alter, double gewicht, Kapitaen kapitaen) {
		super(hersteller, farbe, alter, gewicht);
		this.kapitaen = kapitaen;
	}

	// Setter und Getter
	public void setKapitaen(Kapitaen kapitaen) {
		this.kapitaen = kapitaen;
	}
	
	public Kapitaen getKapitaen() {
		return this.kapitaen;
	}

	@Override
	public void fahren() {
		System.out.println("Schiff fährt auf dem Wasser");
		
	}

	@Override
	public void bremsen() {
		System.out.println("Volle Fahrt zurück! Eisberg voraus!");
		
	}

	@Override
	public String toString() {
		return super.toString() +", " +  this.kapitaen;
	}
	
	
	

}
