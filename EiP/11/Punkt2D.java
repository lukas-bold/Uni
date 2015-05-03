public class Punkt2D {
    private double xKoordinate;

    private double yKoordinate;

    public Punkt2D(double x, double y) {
        this.xKoordinate = x;
        this.yKoordinate = y;
    }

    public void verschiebe(double x, double y) {
        this.xKoordinate += x;
        this.yKoordinate += y;
    }

    public double getXKoordinate() {
        return this.xKoordinate;
    }

    public double getYKoordinate() {
        return this.yKoordinate;
    }
}