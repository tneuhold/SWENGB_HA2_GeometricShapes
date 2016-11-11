package at.fh.ima.swengb.geometry.twodim;

/**
 * Created by neuholdt15 on 09.11.2016.
 */
public class Trapez extends TwoDimShapes {

    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;
    protected double sideH;


    public Trapez(double sideA, double sideB, double sideC, double sideD, double sideH) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideH = sideH;
    }

    @Override
    public double calcArea() {
        return (sideA+sideB)/2*sideH;
    }

    @Override
    public double calcPerimeter() {
        return sideA+sideB+sideC+sideD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trapez trapez = (Trapez) o;

        if (Double.compare(trapez.sideA, sideA) != 0) return false;
        if (Double.compare(trapez.sideB, sideB) != 0) return false;
        if (Double.compare(trapez.sideC, sideC) != 0) return false;
        if (Double.compare(trapez.sideD, sideD) != 0) return false;
        return Double.compare(trapez.sideH, sideH) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideD);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Trapezium{");
        sb.append("a=").append(sideA);
        sb.append(", b=").append(sideB);
        sb.append(", c=").append(sideC);
        sb.append(", d=").append(sideD);
        sb.append(", h=").append(sideH);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }
}
