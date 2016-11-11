package at.fh.ima.swengb.geometry;

import at.fh.ima.swengb.geometry.threedim.Pyramid;
import at.fh.ima.swengb.geometry.threedim.Cuboid;
import at.fh.ima.swengb.geometry.threedim.ThreeDimShapes;
import at.fh.ima.swengb.geometry.threedim.Zylinder;
import at.fh.ima.swengb.geometry.twodim.Kreis;
import at.fh.ima.swengb.geometry.twodim.Quadrat;
import at.fh.ima.swengb.geometry.twodim.Trapez;
import at.fh.ima.swengb.geometry.twodim.TwoDimShapes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neuholdt15 on 11.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.doit();


    }

    private void doit() {

        List<ThreeDimShapes> dim3List = new ArrayList<>();
        List<TwoDimShapes> dim2List = new ArrayList<>();

        fillList3Dim(dim3List);
        printList3Dim(dim3List);
        fillList2Dim(dim2List);
        printList2Dim(dim2List);

    }

    private void printList2Dim(List<TwoDimShapes> dim2List) {

        double sum1 = 0;
        double sum2 = 0;

        System.out.println("-----------2Dim----------");
        for (TwoDimShapes shapes : dim2List) {
            System.out.println(shapes);

        }

        for (TwoDimShapes shapes : dim2List) {
            sum1 += shapes.calcArea();
        }

        for (TwoDimShapes shapes : dim2List) {

            sum2 += shapes.calcPerimeter();
        }
        System.out.println("-----------area----------");
        System.out.println("sum of all area = "+ sum1);
        System.out.println("-----------perimeter----------");
        System.out.println("sum of all perimeter = "+ sum2);


    }

    private void fillList2Dim(List<TwoDimShapes> dim2List) {

        dim2List.add(new Kreis(1, 2, 5.0));
        dim2List.add(new Quadrat(1, 2, 6.0));
        dim2List.add(new Trapez(5.0, 5.0, 6.0, 3.0, 3.0));

    }

    private void printList3Dim(List<ThreeDimShapes> dim3List) {

        double sum1 = 0;
        double sum2 = 0;

        System.out.println("-----------3Dim----------");
        for (ThreeDimShapes shapes : dim3List) {
            System.out.println(shapes);
        }

        for (ThreeDimShapes shapes : dim3List) {
            sum1 += shapes.calcSurfaceArea();
        }

        for (ThreeDimShapes shapes : dim3List) {
            sum2 += shapes.calcVolume();
        }
        System.out.println("-----------surface----------");
        System.out.println("sum of surface: " + sum1);
        System.out.println("-----------volume----------");
        System.out.println("sum of volume: " + sum2);


    }

    private void fillList3Dim(List<ThreeDimShapes> dim3List) {

        dim3List.add(new Pyramid(3.0, 4.0, 5.385, 5.22, 5));
        dim3List.add(new Cuboid(3.0, 4.0, 5.0));
        dim3List.add(new Zylinder(4.0, 6.0));

    }
}
