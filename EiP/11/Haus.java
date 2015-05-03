import java.util.Random;


public class Haus {
	
	public Geschenk[] baum; // Geschenke unter dem Baum
	public Geschenk[] schrank; // Geschenke im Schrank
	public Geschenk[] tisch; // Geschenke auf dem Tisch
	
	/**
	 * Konstruktor für Haus:
	 * Erzeugt ein neues Haus mit zufällig verteilten Geschenken.
	 */
	public Haus() {
		Random r = new Random();
		
		this.baum = new Geschenk[r.nextInt(31)];
		for(int i=0;i<this.baum.length;i++) {
			this.baum[i] = new Geschenk();
		}
		
		this.schrank = new Geschenk[r.nextInt(31)];
		for(int i=0;i<this.schrank.length;i++) {
			this.schrank[i] = new Geschenk();
		}

		this.tisch = new Geschenk[r.nextInt(31)];
		for(int i=0;i<this.tisch.length;i++) {
			this.tisch[i] = new Geschenk();
		}
	}
	public Geschenk[] ausraeumen(){
		Geschenk[] out = new Geschenk[baum.length + tisch.length + schrank.length];
   		System.arraycopy(baum, 0, out , 0, baum.length);
   		System.arraycopy(tisch, 0, out , baum.length , tisch.length);
   		System.arraycopy(schrank, 0, out , baum.length + tisch.length , schrank.length);
   		deleteGeschenke();
   		return out;
	}

	public void deleteGeschenke(){
		baum = new Geschenk[baum.length];
		schrank = new Geschenk[schrank.length];
		tisch = new Geschenk[tisch.length];
	}

}
