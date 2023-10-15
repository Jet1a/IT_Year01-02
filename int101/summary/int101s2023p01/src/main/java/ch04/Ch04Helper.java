package ch04;

public final class Ch04Helper {
   
   public static final double POUND_PER_KG = 2.205;
   public static final double CM_PER_INCH = 2.54;

   public static double computeDiagonal(double side1, double side2) {
      return Math.sqrt(side1*side1 + side2*side2);
   }
   
   public static double poundToKg(double pound) {
      return pound / POUND_PER_KG;
   }
   
   public static double inchToCm(double inch) {
      return inch * CM_PER_INCH;
   }
}
