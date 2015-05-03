import java.util.Random;


public class Geschenk {
	
	/**
	 * Das Gewicht des Geschenks in Gramm
	 */
	public int gewicht;
	
	/**
	 * Konstruktor für Geschenk:
	 * Erzeugt ein neues Geschenk mit zufällig gewählter Größe
	 */
	public Geschenk() {
		Random r = new Random();
		this.gewicht = r.nextInt(901) + 100; // Zufallszahl zwischen 100 und 1000
	}

}
