public class Umrechnung2 {

	private int sec;

	public Umrechnung2(int destSec){
		sec = destSec;
	}

	public int getHrs(){
		return sec/3600;
	}
	public int getMins(){
		return (sec - (getHrs()*3600))/60;
	}
	public int getSecs(){
		return sec - (getHrs()*3600) - (getMins()*60);
	}
	public int[] umrechnen(){
		return new int[]{getHrs(), getMins(), getSecs()};
	}

}