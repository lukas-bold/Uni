public class Quader {
	private Punkt3D p;

	private double xV;
	private double yV;
	private double zV;

	public Quader(double x, double y, double z, double xV, double yV, double zV){
		p = new Punkt3D(x,y,z);
		this.xV = xV;
		this.yV = yV;
		this.zV = zV;
	}

	public void verschiebe(double x, double y, double z){
		p.verschiebe(x,y,z);
	}
}