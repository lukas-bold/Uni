public class Segelschiff extends Schiff{
	
	private int segelflaeche;

	public Segelschiff(int segelflaeche){
		this.segelflaeche = segelflaeche;
	}

	@Override
	public String toString() {
		return "Segelschiff[segelflaeche="+
			segelflaeche + 
			", "+
			super.toString() +
			"]";
	}
	
}