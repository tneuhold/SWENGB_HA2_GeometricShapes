package at.fh.ima.swengb.geometry.threedim;

/**
 * Created by neuholdt15 on 09.11.2016.
 */
public class Cuboid extends ThreeDimShapes {

    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Cuboid(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calcVolume() {
        return sideA*sideB*sideC;
    }

    @Override
    public double calcSurfaceArea() {
        return 2*(sideA*sideB+sideA*sideC+sideB*sideC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cuboid quader = (Cuboid) o;

        if (Double.compare(quader.sideA, sideA) != 0) return false;
        if (Double.compare(quader.sideB, sideB) != 0) return false;
        return Double.compare(quader.sideC, sideC) == 0;

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
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cuboid{");
        sb.append("a=").append(sideA);
        sb.append(", b=").append(sideB);
        sb.append(", c=").append(sideC);
        sb.append(", surface area=").append(calcSurfaceArea());
        sb.append(", volume=").append(calcVolume());
        sb.append('}');
        return sb.toString();
    }

}
