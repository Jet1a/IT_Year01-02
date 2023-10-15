package base;

import ch05.Ch05Circle;
import ch05.Ch05Donut;

public class Ch05ObjectClassDemo {
   public static void main(String[] args) {
      System.out.println("### INT101 Ch05 - Demo Creation and Usage of Class and Object ###");
      demoSimpleObjectCircle();
      democomplexObjectDonut();
   }
   static void demoSimpleObjectCircle() {
      System.out.println("## demo creation and use of simple class and object ##");
      Ch05Circle c = new Ch05Circle(3.0);
      System.out.println("c is " + c); // c.toString()
      System.out.println("c.computeArea() = " + c.computeArea());
      System.out.println("c.computeCircumference() = " + c.computeCircumference());
      Ch05Circle d = c;
      System.out.println("Ch05Circle d = c;");
      d.setRadius(4.0);
      System.out.println("d.setRadius(4.0);");
      System.out.println("c is " + c);
      System.out.println("c.computeArea() = " + c.computeArea());
      System.out.println("c's diameter is " + c.getDiameter());
      System.out.println("c's radius is " + c.getRadius());
   }
   static void democomplexObjectDonut() {
      System.out.println("## demo creation and use of complex class and object ##");
      Ch05Donut d = new Ch05Donut(5.0,7.0);
      System.out.println("d is " + d); // d.toString()
      System.out.println("d's inner radius is " + d.getInnerRadius());
      System.out.println("d's outer radius is " + d.getOuterRadius());
      System.out.println("d's area is " + d.getArea());

      System.out.println("Resizing d ...");
      d.resizeInner(3.0);
      System.out.println("d's inner radius is " + d.getInnerRadius());
      System.out.println("d's outer radius is " + d.getOuterRadius());
      System.out.println("d's area is " + d.getArea());
      System.out.println("d is " + d); // d.toString()
   }
}
