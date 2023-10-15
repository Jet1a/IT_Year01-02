package base;

public class Ch01DataTypeDemo {

    public static void main(String[] args) {
       System.out.println("### INT101 Ch01 - Demo Datatypes, Literals, and Variables ###");
       demoPrimitiveBooleanType();
       demoPrimitiveIntegerTypes();
       demoPrimitiveFloatingPointTypes();
    }

   static void demoPrimitiveBooleanType() {
      System.out.println("## Primitive Type: boolean ##");
      
      // literals
      // boolean type has two literals which are true and false
      System.out.println("boolean literal: " + true);
      System.out.println("boolean literal: " + false);
      
      // variables
      boolean b; // the data type of variable b is boolean
      b = true; // variable b is set to true
      System.out.println("the value of b is ... " + b);
   }

   static void demoPrimitiveIntegerTypes() {
      System.out.println("## Primitive Integer Types: byte, short, int, long, (and char) ##");
      
      // literals
      // there are 5 primitive integer types: byte, short, int, long, and char
      System.out.println("int literal (zero): " + 0); // zero
      System.out.println("int literal (negative): " + -100); // negative value
      System.out.println("int literal (positive): " + 3000); // positive value
      System.out.println("int literal (very large value): " + 2_000_000_000);

      // there are many forms of int literals 
      System.out.println("int literal: " + 9_000_000); // use _ for readability
      System.out.println("int literal (0b...) : " + 0b1000_0000_0000_0000_0000_0000_0000_0000); // 32-bit binary, begin with 0b or 0B
      System.out.println("int literal (0...)  : " + 0377_7777_7777); // octal number (base-8) begin with 0
      System.out.println("int literal (0x...) : " + 0xFFFF_FFFF); // hexadecimal number (base-16) begin with 0x or 0X

      // byte and short do not have their own literal forms
      
      // literal forms of long are the same as int but end with L or l
      System.out.println("long literal: " + 9_000_000_000_000_000_000L);
      
      // literal form of char
      System.out.println("char literal: [" + 'a' + "]");
      System.out.println("char literal: [" + 'A' + "]");
      // use backslash as the escape character for special meanings
      System.out.println("char literal ('\\n') : [" + '\n' + "] (new line)"); // new line character
      System.out.println("char literal ('\\b') : [" + '\b' + "] (backspace)"); // backspace character
      System.out.println("char literal ('\\'') : [" + '\'' + "] (single quote)"); // single quote character
      System.out.println("char literal ('\\\\') : [" + '\\' + "] (backslash)"); // backslash character
      // use \\uXXXX for unicode characters
      System.out.println("char literal ('\\u0041') : [" + '\u0041' + "] (unicode)"); // 0x41

      // variables
      int i; // the data type of variable i is int
      i = 2_000_000_000; // variable i is set to two billions
      System.out.println("the value of i (int) is ... " + i);

      long lo; // the data type of variable lo is long (64-bit integer)
      lo = 9_000_000_000_000_000_000L; // variable lo is set to nine billion billions
      System.out.println("the value of lo (long) is ... " + lo);

      // byte and short does not have their own literal forms 
      // they use int literal form as long as the value is not out of range
      byte b = -128; // byte is between -128 and 127
      System.out.println("the value of b (byte) is ... " + b);
      short s = 0b0111_1111_1111_1111; // short is between -32768 and 32767
      System.out.println("the value of s (short) is ... " + s);

      // char variables
      char c, d, e;
      c = 65;
      d = 0x41;
      e = 'A';
      // char type is printed as character; not as integer
      System.out.println("the value of c [65]   (char) is ... [" + c + "]");
      System.out.println("the value of d [0x41] (char) is ... [" + d + "]");
      System.out.println("the value of e ['A']  (char) is ... [" + e + "]");
   }

   static void demoPrimitiveFloatingPointTypes() {
      System.out.println("## Primitive Floating-Point Number Types: float, double ##");
      
      // literals
      // there are 2 primitive floating-point number types: float, double
      System.out.println("double literal (1.0) : " + 1.0); // with decimal point
      System.out.println("double literal (1D)  : " + 1D); // end with D or d
      System.out.println("double literal (#.#) : " + 1123_456_789.0123_4567_8901_2345);      

      // scientific notation X.XXeYY = X.XX * 10^YY (use E or e)
      System.out.println("double literal (1e2)     : " + 1e2); // = 1.0 * 100
      System.out.println("double literal (1.23e-4) : " + 1.23e-4); // = 1.23 / 10000 
      System.out.println("double literal (1.#e300) : " + 1.2345_6789_0123_4567_89e300); // 1.23... * 10^300
      System.out.println("double literal (0x8.0p5) : " + 0x8.0p5); // 0x8 * 2^5 = 2^3 * 2^5 = 2^8 = 256
      
      // literal forms of float are the same as double but end with F or f
      System.out.println("float literal (1.#e#F) : " + 1.2345_6789_0123_4567_89e38F);

      // variables
      double d; // the data type of variable d is double
      d = -9.87E-2; // variable d is set to -0.0987
      System.out.println("the value of d [-9.87E-2] (double) is ... " + d);
      float f; // the data type of variable f is float
      f = -9.87E-2F; // variable f is set to -0.0987 (9.87 * 10^-2 = 9.87 / 100)
      System.out.println("the value of f [-9.87E-2F] (float) is ... " + f);
   }
}
