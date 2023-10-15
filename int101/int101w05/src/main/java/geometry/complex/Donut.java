package geometry.complex;

import geometry.Circle;

public class Donut {
    // create a default minimum thickness of donut to 3.0 DEFAULT_THICKNESS 
    private static final double DEFAULT_THICKNESS = 3.0;
    private Circle inner;
    private Circle outer;

    public Donut(double innerRadius, double outerRadius) {
        inner = new Circle(innerRadius);
        double minOuterRadius = inner.getRadius() + DEFAULT_THICKNESS;
        if (minOuterRadius < outerRadius) {
            outer = new Circle(outerRadius);
        } else {
            outer = new Circle(minOuterRadius);
        }
    }

    // constructor (inner radius, outer radius) // main
    // constructor (inner radius) // delegate
    // constructor () // delegate

    public double getInnerRadius() {
        return inner.getRadius();
    }

    public double getOuterRadius() {
        return outer.getRadius();
    }

    public double getThickness() {
        return outer.getRadius() - inner.getRadius();
    }

    // getInnerRadius()
    // getOuterRadius()
    // getThickness()

    public boolean setInner(double innerRadius) {
        Circle newInner = new Circle(innerRadius);
        innerRadius = newInner.getRadius();
        if (outer.getRadius() - innerRadius < DEFAULT_THICKNESS) {
            return false;
        } else {
            inner = newInner;
            return true;
        }
    }

    public boolean setOuter(double outerRadius) {
        Circle newOuter = new Circle(outerRadius);
        outerRadius = newOuter.getRadius();
        if (inner.getRadius() > outerRadius) {
            return false;
        } else {
            outer = newOuter;
            return true;
        }
    }

    public boolean setThickness(double thickness) {
        if (thickness >= DEFAULT_THICKNESS){
            double no = thickness + inner.getRadius();
            Circle newOuter = new Circle(no);
            outer = newOuter;
            return true;
        }
        return false;
    }

    // setInnerRadius(inner radius) // use old outer, return (boolean) false if fail
    // setOuterRadius(outer radius) // use old inner, return (boolean) false if fail
    // setThickness(thickness) // use old inner, return (boolean) false if fail

    public double computeArea(){
        double area = outer.computeArea() - inner.computeArea();
        return area;
    }
    // computeArea()

    // toString() "Donut(inner radius,outer radius)"

    @Override
    public String toString() {
        return "Donut{" + "inner=" + inner + ", outer=" + outer + '}';
    }


}
