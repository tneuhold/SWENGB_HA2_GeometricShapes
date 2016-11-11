package at.fh.ima.swengb.geometry.threedim;

/**
 * Created by neuholdt15 on 09.11.2016.
 */
public class Pyramid extends ThreeDimShapes {

    protected double sideA;
    protected double sideB;
    protected double sideHa;
    protected double sideHb;
    protected double sideH;

    public Pyramid(double sideA, double sideB, double sideHa, double sideHb, double sideH) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideHa = sideHa;
        this.sideHb = sideHb;
        this.sideH = sideH;
    }

    @Override
    public double calcVolume() {
        return 1/3*sideA*sideB*sideH;
    }

    @Override
    public double calcSurfaceArea() {
        return sideA*sideB+sideA*sideHa+sideB*sideHb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pyramid pyramid = (Pyramid) o;

        if (Double.compare(pyramid.sideA, sideA) != 0) return false;
        if (Double.compare(pyramid.sideB, sideB) != 0) return false;
        if (Double.compare(pyramid.sideHa, sideHa) != 0) return false;
        if (Double.compare(pyramid.sideHb, sideHb) != 0) return false;
        return Double.compare(pyramid.sideH, sideH) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideHa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideHb);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pyramid{");
        sb.append(" a=").append(sideA);
        sb.append(", b=").append(sideB);
        sb.append(", ha=").append(sideHa);
        sb.append(", hb=").append(sideHb);
        sb.append(", h=").append(sideH);
        sb.append(", surface area=").append(calcSurfaceArea());
        sb.append(", volume=").append(calcVolume());
        sb.append('}');
        return sb.toString();
    }
}
