package base;

public class Ch02OperatorDemo {

    public static void main(String[] args) {
       System.out.println("### INT101 Ch02 - Demo Operators ###");
       demoArithmeticOperations(); // input: numeric; output: numeric
       demoBooleanOperations(); // input: boolean; output: boolean
       demoBitwiseOperations(); // input: integer; output: integer
       demoRelationalOperations(); // input: numeric; output: boolean
       // equality (==) & inequality (!=) operator:: 
       // input: same type; output: boolean
       demoTypeCastingOperations(); // automatic upcasting; manual downcasting
    }

   static void demoArithmeticOperations() {
      System.out.println("## Arithmetic Operations ##");
      // ++, --, +, -, *, /, % only works on numeric types: 
      // integer types (byte, short, int, long, char) and
      // floating-point types (float, double)
      // NOTE: + is also used as the concatenation operator on String 
      
      // +, -, *, / on integers vs decimal number
      System.out.println("21 / 8 (round down) = " + 21/8); // integer division rounds down
      System.out.println("21 % 8 (remainder) = " + 21%8); // integer remainder
      System.out.println("21.0 / 8 (round down) = " + 21.0/8); // number division
      System.out.println("21.0 % 8 (remainder) = " + 21.0%8); // number remainder
      System.out.println("2.1 % 0.8 (remainder) = " + 2.1%0.8); // number remainder
      System.out.println("0.21 % 0.8 (remainder) = " + 0.21%0.8); // number remainder
      
      // pre/post increment/decrement
      System.out.println("# pre/post increment/decrement #");
      short x = 10;
      System.out.println("x=" + x + "; x++=" + x++ + "; x=" + x); // post-increment (return old value)
      System.out.println("x=" + x + "; ++x=" + ++x + "; x=" + x); // pre-increment (return new value)
      System.out.println("x=" + x + "; x--=" + x-- + "; x=" + x); // post-decrement (return old value)
      System.out.println("x=" + x + "; --x=" + --x + "; x=" + x); // pre-decrement (return new value)
      
      // (arithmetic) compound assignment: +=, -=, *=, /=, %=
      System.out.println("# (arithmetic) compound assignment #");
      System.out.println("x=" + x);
      x += 100;
      System.out.println("x += 100; x=" + x);
      x -= 80;
      System.out.println("x -= 80; x=" + x);
      x *= 3;
      System.out.println("x *= 3; x=" + x);
      x /= 2;
      System.out.println("x /= 2; x=" + x);
      x %= 7;
      System.out.println("x %= 7; x=" + x);
   }

   static void demoBooleanOperations() {
      System.out.println("## Boolean Operations ##");
      // &, &&, |, ||, ^, !
      System.out.println("true & false (AND) = " + (true & false));
      System.out.println("true && false (Short-circuit AND) = " + (true && false));
      System.out.println("true | false (OR) = " + (true | false));
      System.out.println("true || false (Short-circuit OR) = " + (true || false));
      System.out.println("true ^ false (Exclusive-OR) = " + (true ^ false));
      System.out.println("! true (NOT) = " + (! true));
      
      System.out.println("# (boolean) compound assignment #");
      boolean b = true;
      System.out.println("b=" + b);
      b &= false;
      System.out.println("b &= false; b=" + b);
      b |= true;
      System.out.println("b |= true; b=" + b);
      b ^= true;
      System.out.println("b ^= true; b=" + b);
   }

   static void demoBitwiseOperations() {
      System.out.println("## Bitwise Operations ##");
      // &, |, ^, ~
      // <<, >>, >>>
      int x = 0b1011_0111;
      int y = 0b1100_1000;
      System.out.println(
         "x  ="   + String.format("%32s",Integer.toBinaryString(x)).replace(" ", "0") + " [" + x + "]" + 
         "\ny  =" + String.format("%32s",Integer.toBinaryString(y)).replace(" ", "0") + 
         "\nx&y=" + String.format("%32s",Integer.toBinaryString(x&y)).replace(" ", "0") + " (AND)" + 
         "\nx|y=" + String.format("%32s",Integer.toBinaryString(x|y)).replace(" ", "0") + " (OR)" +
         "\nx^y=" + String.format("%32s",Integer.toBinaryString(x^y)).replace(" ", "0") + " (XOR)" +
         "\n~x =" + String.format("%32s",Integer.toBinaryString(~x)).replace(" ", "0") + " [" + ~x + "] (complement)");
      int z = ~x;
      System.out.println(
         "x    ="   + String.format("%32s",Integer.toBinaryString(x)).replace(" ", "0") + " [" + x + "]" +
         "\nx<<3 =" + String.format("%32s",Integer.toBinaryString(x<<3)).replace(" ", "0") + " [" + (x<<3) + "] (left shift)" +
         "\nx>>3 =" + String.format("%32s",Integer.toBinaryString(x>>3)).replace(" ", "0") + " [" + (x>>3) + "] (signed right shift)" +
         "\nx>>>3=" + String.format("%32s",Integer.toBinaryString(x>>>3)).replace(" ", "0") + " [" + (x>>>3) + "] (unsigned right shift)" +
         "\nz    =" + String.format("%32s",Integer.toBinaryString(z)).replace(" ", "0") + " [" + z + "]" +
         "\nz<<3 =" + String.format("%32s",Integer.toBinaryString(z<<3)).replace(" ", "0") + " [" + (z<<3) + "] (left shift)" +
         "\nz>>3 =" + String.format("%32s",Integer.toBinaryString(z>>3)).replace(" ", "0") + " [" + (z>>3) + "] (signed right shift)" +
         "\nz>>>3=" + String.format("%32s",Integer.toBinaryString(z>>>3)).replace(" ", "0") + " [" + (z>>>3) + "] (unsigned right shift)");
      
      System.out.println("# (bitwise) compound assignment #");
      int i = 0b1_1011_0111_0000_1111;
      System.out.println("          i = " + String.format("%32s", Integer.toBinaryString(i).replace(" ", "0")));
      i <<= 16;
      System.out.println("i <<= 16; i = " + String.format("%32s", Integer.toBinaryString(i).replace(" ", "0")));
      i >>= 11;
      System.out.println("i >>= 11; i = " + String.format("%32s", Integer.toBinaryString(i).replace(" ", "0")));
      i >>>= 7;
      System.out.println("i >>>= 7; i = " + String.format("%32s", Integer.toBinaryString(i).replace(" ", "0")));
   }

   static void demoRelationalOperations() {
      System.out.println("## Relational Operations ##");
      // ==, !=, <, <=, >, >=
      int x=1, y=2, z=3;
      System.out.println("# on integer: x="+x+", y="+y+", z="+z + " #");
      System.out.println("x+y == z ? " + (x+y == z));
      System.out.println("x != y ? " + (x != y));
      System.out.println("x < y ? " + (x < y));
      System.out.println("x > y ? " + (x > y));
      System.out.println("x <= y ? " + (x <= y));
      System.out.println("x >= y ? " + (x >= y));
      double a=0.1, b=0.2, c=0.3;
      System.out.println("# on floating-point number: a="+a+", b="+b+", c="+c + " #");
      System.out.println("a+b == c ? " + (a+b == c));
      System.out.println("a+b != c ? " + (a+b != c));
      System.out.println("a+b <= c ? " + (a+b <= c));
      System.out.println("a+b > c ? " + (a+b > c));
      System.out.println("a+b = " + (a+b));
   }

   static void demoTypeCastingOperations() {
      System.out.println("## Type Casting Operations ##");

      System.out.println("# automatic upcasting #");
      // automatic upcasting (small size upcast to large size)
      // byte (8-bit) -> short (16-bit) -> int (32-bit)
      // char (unsigned 16-bit) -> int (32-bit)
      // int (32-bit) -> long (64-bit) 
      // long (64-bit integer) -> float (32-bit float) -> double (64-bit float)
      byte b = 65; // assignment
      char c = 65; // assignment; 
      short s = b; // byte (8-bit) to short (16-bit)
      // ** (signed) byte cannot upcast to (unsigned) char **
      int i = s; // short (16-bit) to int (32-bit)
      int j = c; // char (unsigned 16-bit) to int (32-bit)
      long lo = i; // int (32-bit) to long (64-bit)
      float f = lo; // long (64-bit integer) to float (32-bit floating-point)
      double d = f; // float (32-bit float) to double (64-bit float)
      System.out.println("b="+b+",s="+s+",c="+c+",i="+i+",j="+j+",lo="+lo+",f="+f+",d="+d);

      // long upcast to float/double may loss some precision
      System.out.println("# long upcast to float/double may lost some precision #");
      long v = 0x1800_0000_0000_0100L; // 0001[1]_1000[8]...0(56)
      long u = 0x1800_0000_0000_0180L; // 0001[1]_1000[8]
      System.out.println("long  = " + String.format("0x%x",v) + " (63-bit precision)");
      System.out.println("double=" + String.format("%a",(double) v) + " (53-bit precision)");
      System.out.println("long  = " + String.format("0x%x",u) + " (63-bit precision)");
      System.out.println("double=" + String.format("%a",(double) u) + " (53-bit precision)");

      // manual downcast (large size downcast to small size)
      // double -> float -> long -> int
      // int -> short -> byte
      // int -> char
      System.out.println("# manual downcasting (most-significant bits may be cut) #");
      f = (float) d; // double downcast to float
      lo = (long) f; // float downcast to long
      i = (int) lo; // long downcast to int
      s = (short) i; // int downcast to short
      c = (char) j; // int downcast to char
      b = (byte) s; // short downcast to byte
      System.out.println("d="+d+",f="+f+",lo="+lo+",i="+i+",j="+j+",c="+c+",s="+s+",b="+b);
      char ch = 0x8000;
      short sh = (short) ch;
      System.out.print("ch = " + ((int) ch) + " (0x" + Integer.toHexString(ch) + ")");
      System.out.println(", (short) ch = " + sh + " (0x" + Integer.toHexString(sh) + ")");
      lo = 0x0000_1000L;
      System.out.println("lo=" + lo + ", (int) lo = " + (int) lo);
      lo = 0x8000_0000L;
      System.out.println("lo=" + lo + ", (int) lo = " + (int) lo);
      lo = 0x8000_0000_ffff_ffffL;
      System.out.println("lo=" + lo + ", (int) lo = " + (int) lo);
   }

}
