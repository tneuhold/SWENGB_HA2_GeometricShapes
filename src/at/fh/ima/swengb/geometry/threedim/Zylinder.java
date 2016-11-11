package at.fh.ima.swengb.geometry.threedim;

/**
 * Created by neuholdt15 on 09.11.2016.
 */
public class Zylinder extends ThreeDimShapes {

    protected double sideR;
    protected double sideH;

    public Zylinder(double sideR, double sideH) {
        this.sideR = sideR;
        this.sideH = sideH;
    }

    @Override
    public double calcVolume() {
        return Math.PI*sideR*sideR*sideH;
    }

    @Override
    public double calcSurfaceArea() {
        return 2*Math.PI*sideR*(sideR+sideH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Zylinder zylinder = (Zylinder) o;

        if (Double.compare(zylinder.sideR, sideR) != 0) return false;
        return Double.compare(zylinder.sideH, sideH) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideR);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zylinder{");
        sb.append("r=").append(sideR);
        sb.append(", h=").append(sideH);
        sb.append(", surface area=").append(calcSurfaceArea());
        sb.append(", volume=").append(calcVolume());
        sb.append('}');
        return sb.toString();
    }
}
