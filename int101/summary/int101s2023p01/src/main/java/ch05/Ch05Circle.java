package ch05;

public class Ch05Circle {
   private double radius;
   public Ch05Circle(double radius) { this.radius = radius; }
   public double getRadius() { return radius; }
   public void setRadius(double radius) { this.radius = radius; }
   public double getDiameter() { return radius * 2; }
   public double computeArea() { return Math.PI * radius * radius; }
   public double computeCircumference() { return 2 * Math.PI * radius; }
   @Override
   public String toString() { return "Circle(" + radius + ")"; }
}
