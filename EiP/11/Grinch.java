public class Grinch {
	
	public static Haus[] stadt;
	
	private Geschenk[] geklauteGeschenke = new Geschenk[0];

	private int restzeit = 80;
	
	public void aufTourGehen() {
		Geschenk[] currentGes = new Geschenk[0];
		int i = 0;
		while (restzeit > 0 && i < stadt.length) {
			addGeschenke(currentGes);
			currentGes = stadt[i].ausraeumen();
			restzeit = 1 + restzeit - (currentGes.length / 10);
			i++;
		}
	}

	public int gesamtGewicht(){
		int out = 0;
		for (int i = 0;	i< geklauteGeschenke.length ; i++) {
			out =+ geklauteGeschenke[i].gewicht;
		}
		return out;
	}

	public void inventur(){
		System.out.println(
			"Ich habe "+
			geklauteGeschenke.length +
			" mit einem Gesamtgewicht von " +
			gesamtGewicht() +
			"kg geklaut!"
		);
	}

	private void addGeschenke(Geschenk[] addGes){
		Geschenk[] oldGes = geklauteGeschenke;
		geklauteGeschenke = new Geschenk[geklauteGeschenke.length + addGes.length];
   		System.arraycopy(oldGes, 0, geklauteGeschenke, 0, oldGes.length);
   		System.arraycopy(addGes, 0, geklauteGeschenke, oldGes.length, addGes.length);
	}


	public static void main(String[] args) {
		// mit dieser Methode können Sie nachher Ihre Implementierung testen:
		test();
	}
	
	public static void test() {
		stadt = new Haus[12];
		for(int i=0;i<stadt.length;i++) {
			stadt[i] = new Haus();
		}
		
		Grinch grinch = new Grinch();
		
		grinch.aufTourGehen();
		grinch.inventur();
	}

}
