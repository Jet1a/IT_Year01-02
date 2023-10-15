package base;

import ch04.Ch04Helper;

public class Ch04UtilityClassDemo {
   public static void main(String[] args) {
      System.out.println("### INT101 Ch04 - Demo Creation and Usage of Utility Class ###");
      demoRightTriangle();
      demoConversion();
   }
   
   static void demoRightTriangle() {
      double base = 3.0;
      double height = 4.0;
      System.out.print("RightTriangle: side1=" + base + ", side2=" + height);
      System.out.println(" ==> Diagonal=" + Ch04Helper.computeDiagonal(base,height));
   }

   static void demoConversion() {
      System.out.println("## Unit Conversion ##");
      System.out.println("1 kg. = " + Ch04Helper.POUND_PER_KG + " pounds");
      System.out.println("1 inch. = " + Ch04Helper.CM_PER_INCH + " cm.");

      double pound = 100.0;
      System.out.println(pound + " pounds = " + Ch04Helper.poundToKg(pound) + " kg.");

      double inch = 12.0;
      System.out.println(inch + " inches = " + Ch04Helper.inchToCm(inch) + " cm.");
   }
}
