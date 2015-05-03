public class Punkt3D extends Punkt2D{

	private double zKoordinate;


    public Punkt3D(double x, double y, double z) {
    	super(x, y);
        this.zKoordinate = z;
    }

    public double getZKoordinate(){
    	return zKoordinate;
    }

    public void verschiebe(double x, double y, double z) {
    	super.verschiebe(x,y);
        this.zKoordinate += z;
    }
}