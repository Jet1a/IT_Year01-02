package ch05;

public class Ch05Donut {
   private Ch05Circle inner;
   private Ch05Circle outer;
   public Ch05Donut(double in, double out) {
      inner = new Ch05Circle(in);
      outer = new Ch05Circle(out);
   }
   public void resizeInner(double in) { inner = new Ch05Circle(in); }
   public void resizeOuter(double out) { outer = new Ch05Circle(out); }
   public double getInnerRadius() { return inner.getRadius(); }
   public double getOuterRadius() { return outer.getRadius(); }
   public double getArea() {
      return outer.computeArea() - inner.computeArea();
   }
   @Override
   public String toString() {
      return "Donut(" + getInnerRadius() + "," + getOuterRadius() + ")";
   }
   
}
