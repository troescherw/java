package spe.mch;

public class Main {

	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.setHersteller("Audi");
		auto.setFarbe("rot");
		auto.setAlter(4);
		auto.setGewicht(1480.6);
		auto.setAnzahlPlaetze(4);
		
		auto.fahren();
		auto.bremsen();
		System.out.println(auto);
		
		Cabrio cabrio = new Cabrio();
		cabrio.setHersteller("BMW");
		cabrio.setFarbe("blau");
		cabrio.setAlter(3);
		cabrio.setGewicht(1920.8);
		System.out.println(cabrio);
		cabrio.dachBewegen();
		System.out.println(cabrio.isDachOffen());
		cabrio.dachBewegen();
		System.out.println(cabrio.isDachOffen());
		cabrio.fahren();
		cabrio.bremsen();
		cabrio.dachBewegen();
		System.out.println(cabrio);
		
		Auto meinAuto = new Auto("Toyota", "grün",  10, 1690.6, 4);
		System.out.println(meinAuto);
		
		Cabrio meinCabrio = new Cabrio("Mercedes", "schwarz", 3, 2189.2, 2);
		System.out.println(meinCabrio);
		
		LKW lkw = new LKW("MAN", "schwarz", 9, 12590.0, 7500);
		System.out.println(lkw);
		lkw.beladen(5000);
		System.out.println(lkw);
		lkw.beladen(3000);
		System.out.println(lkw);
		lkw.entladen();
		System.out.println(lkw);
		
		Kapitaen k = new Kapitaen("Peter", "Hansen");
		Schiff schiff = new Schiff("Blohm&Voss", "weiß", 21, 123654, k);
		System.out.println(schiff);
		werkstatt(meinAuto);
		werkstatt(lkw);
		werkstatt(cabrio);
		
		
		
	}
	
	// Polymorphie
	
	public static void werkstatt(Motorgetrieben m) {
		
		if(m instanceof LKW lkw) {
			lkw.entladen();
		}
		
		m.motorWarten();
		m.tanken();
		
		
		
	}
	


}
