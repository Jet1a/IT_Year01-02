package int101w05;

import geometry.Circle;
import geometry.complex.Donut;

public class Int101w05 {

    public static void main(String[] args) {
        
        Donut d = new Donut(3.0,7.5);
        System.out.println("Area: " + d.computeArea());
        System.out.println(d);
    }
}
