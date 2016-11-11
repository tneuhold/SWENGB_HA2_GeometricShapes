package at.fh.ima.swengb.geometry.twodim;

/**
 * Created by neuholdt15 on 09.11.2016.
 */
public class Quadrat extends TwoDimShapes {

    protected double sideA;

    public Quadrat() {
    }

    public Quadrat(int x, int y, double sideA) {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
    }

    @Override
    public double calcArea() {
        return sideA*sideA;
    }

    @Override
    public double calcPerimeter() {
        return 4*sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Quadrat quadrat = (Quadrat) o;

        return Double.compare(quadrat.sideA, sideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Square{");
        sb.append("a=").append(sideA);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }
}
