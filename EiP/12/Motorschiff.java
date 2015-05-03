public class Motorschiff extends Schiff{
	
	private int motorleistung;

	public Segelschiff(int motorleistung){
		this.motorleistung = motorleistung;
	}

	@Override
	public String toString() {
		return "Motorschiff[motorleistung="+
			motorleistung + 
			", "+
			super.toString() +
			"]";
	}


}