public class Koordinaten
{
	public static void katToPol(double x, double y) {
		System.out.println("Die Polarkoordinaten fuer die" +
											 " kartesischen Koordinaten");
		System.out.println(" x="+x+" und y="+y+" sind alpha="+alpha(x,y)+
											 " und delta="+delta(x,y)+".");
	}
	public static void polToKat(double a, double d) {
		System.out.println("Die kartesischen Koordinaten fuer die" +
											 " Polarkoordinaten");
		System.out.println(" alpha="+a+" und delta="+d+" sind"+
											 " x="+x(a,d)+" und"+
											 " y="+y(a,d)+".");
	}
	public static double x(double a, double d) {
			return d*Math.cos(a);
	}

	public static double y(double a, double d) {
			return d*Math.sin(a);
	}

	public static double delta(double x, double y){
		return Math.sqrt(x*x+y*y);
	}

	public static double alpha(double x, double y) {
		if (x > 0){
			if (y >= 0){
				return Math.atan(x/y);
			}
			else {
				return Math.atan(x/y) + Math.PI;
			}
		}
		else if (x < 0) {
			return Math.atan(y/x) + Math.PI;
		}
		else {
			if (y > 0) {
				return 0.5*Math.PI;
			}
			else if (y < 0) {
				return 3*0.5*Math.PI;
			}
			else {
				return 0;
			}
		}
	}

	public static void main(String[] args)
	{
		polToKat(3.0, 4.0);
		polToKat(0.0, 4.0);
		polToKat(0.0, 4.0);
		polToKat(0.0, 0.0);

		katToPol(5.0, 0.9272952180016122);
		katToPol(4.0, 1.5707963267948966);
		katToPol(4.0, 4.71238898038469);
		katToPol(0.0, 0.0);
	}
}
