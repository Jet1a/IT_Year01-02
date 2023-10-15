package base;

public class Ch03Precedence {
   public static void main(String[] args) {
       System.out.println("### INT101 Ch03 - Demo Precedence and Associativity of Operators ###");
      // conditional (right): x ? y : z
      // (compound) assignment (right): x = y, x += y
      demoPostfixBeforePrefix();
      demoPrefixBeforeMultiplicative();
      demoMultiplicativeBeforeAdditive();
      demoAdditiveBeforeShift();
      demoShiftBeforeComparison();
      demoComparisonBeforeEquality();
      demoEqualityBeforeLogic();
      demoLogicBeforeShortCircuitLogic();
      demoEverythingBeforeAssignment();
   }

   static void demoPostfixBeforePrefix() {
      System.out.println("## Precedence: Postfix (left assoc.) before Prefix (RIGHT assoc.) ##");
      // postfix (left assoc): x++, x--, .member, array[]
      // prefix (right assoc): ++x, --x, +x, -x, ~x, !x, (typecast) x, new CLASS()
      int a=100;
      System.out.println("a=" + a);
      int b = -a++; // same as -(a++)
      System.out.println("after b = -a++; // same as b = -(a++)");
      System.out.println("a=" + a + ",b=" + b);
   }

   static void demoPrefixBeforeMultiplicative() {
      System.out.println("## Precedence: Prefix (RIGHT) before Multiplicative (left) ##");
      // prefix (right assoc): ++x, --x, +x, -x, ~x, !x, (typecast) x, new CLASS()
      // multiplicative: *, /, %

      int a=99, b=20, c=3;
      System.out.println("a=" + a + ",b=" + b + ",c=" + c);
      int d = ++a*b/c; // same as (++a)*b/(++c)
      System.out.println("++a*b/c = (++a)*b/c = " + d);

      System.out.println("# [prefix unary] casting before multiplication #");
      System.out.println("[??]  (double) 100 /6  = " +  (double) 100 /6 );
      System.out.println("[ok] ((double) 100)/6  = " + ((double) 100)/6 ); // ok
      System.out.println("[no]  (double)(100 /6) = " +  (double)(100 /6)); // no
   }

   static void demoMultiplicativeBeforeAdditive() {
      System.out.println("## Precedence: Multiplicative (left) before Additive/Concat (left) ##");
      // multiplicative: *, /, %
      // additive,String concat: x+x, x-x, "string" + "string"
      int a=99, b=20, c=3;
      System.out.println("a=" + a + ",b=" + b + ",c=" + c);
      System.out.println("[??]  a + b * c  = " + ( a + b * c ));
      System.out.println("[ok]  a +(b * c) = " + ( a +(b * c))); // ok
      System.out.println("[no] (a + b)* c  = " + ((a + b)* c )); // no

      System.out.println("1+ 2*3 +\"text\"+ 4*5 +6 = " + (1+ 2*3 +"text"+ 4*5 +6));
      System.out.println("1+(2*3)+\"text\"+(4*5)+6 = " + (1+(2*3)+"text"+(4*5)+6));
   }

   static void demoAdditiveBeforeShift() {
      System.out.println("## Precedence: Additive (left) before Shift (left) ##");
      // additive,String concat: x+x, x-x, "string" + "string"
      // bitwise shift (left): x<<n, x>>n, x>>>n
      System.out.println("[??]  3 << 2 + 1 = " + ( 3<< 2 +1));
      System.out.println("[ok]  3 <<(2 + 1)= " + ( 3<<(2 +1))); // ok
      System.out.println("[no] (3 << 2)+ 1 = " + ((3<< 2)+1)); // no

      System.out.println("# Shift is left associative #");
      System.out.println("[??]  1 << 2 << 3 = " +  (1<< 2 <<3));
      System.out.println("[ok] (1 << 2)<< 3 = " + ((1<< 2)<<3)); // ok
      System.out.println("[no]  1 <<(2 << 3)= " + ( 1<<(2 <<3))); // no
   }

   static void demoShiftBeforeComparison() {
      System.out.println("## Precedence: Shift (left) before Comparison (left) ##");
      // bitwise shift (left): x<<n, x>>n, x>>>n
      // comparison (left): x<y, x>y, x<=y, x>=y, x instanceof CLASS
      System.out.println(" 8 >> 2 > 3 >> 1  ... = " + ( 8>>2 > 3>>1 ));
      System.out.println("(8 >> 2)>(3 >> 1) ... = " + ((8>>2)>(3>>1)));
      System.out.println(" 8 >>(2 > 3)>> 1  ... = INVALID EXPRESSION");
   }

   static void demoComparisonBeforeEquality() {
      System.out.println("## Precedence: Comparison (left) before Equality (left) ##");
      // comparison (left): x<y, x>y, x<=y, x>=y, x instanceof CLASS
      // equality/inequality (left): x==y, x!=y
      System.out.println(" 1 <= 2 == 3 < 4  ... = " + ( 1<=2 == 3<4 ));
      System.out.println("(1 <= 2)==(3 < 4) ... = " + ((1<=2)==(3<4)));
      System.out.println(" 1 <=(2 == 3)< 4  ... = INVALID EXPRESSION");
   }

   static void demoEqualityBeforeLogic() {
      System.out.println("## Precedence: Equality (left) before AND, XOR, then OR (left) ##");
      // equality/inequality (left): x==y, x!=y
      // bitwise/logical AND (left): x & y
      // bitwise/logical XOR (left): x ^ y
      // bitwise/logical OR (left): x | y

      System.out.println("# [Equality ==] before [AND &] #");
      System.out.println("[??]  false & false == false  ... = " +  (false& false ==false ));
      System.out.println("[ok]  false &(false == false) ... = " +  (false&(false ==false))); // ok
      System.out.println("[no] (false & false)== false  ... = " + ((false& false)==false )); // no

      System.out.println("# [AND &] before [XOR ^] #");
      System.out.println("[??]  true ^ false & false  ... = " + ( true ^ false & false ));
      System.out.println("[ok]  true ^(false & false) ... = " + ( true ^(false & false))); // ok
      System.out.println("[no] (true ^ false)& false  ... = " + ((true ^ false)& false )); // no

      System.out.println("# [XOR ^] before [OR |] #");
      System.out.println("[??]  true | true ^ true  ... = " + ( true | true ^ true ));
      System.out.println("[ok]  true |(true ^ true) ... = " + ( true |(true ^ true))); // ok
      System.out.println("[no] (true | true)^ true  ... = " + ((true | true)^ true )); // no
   }

   static void demoLogicBeforeShortCircuitLogic() {
      System.out.println("## Precedence: Logic (left) before Short-Circuit Logic (left) ##");
      // logics, then short-circuit logics: x&y, x^y, x|y, x&&y, x||y
      System.out.println("# [OR |] before [short-AND &&] #");
      System.out.println("[??]  false && true | true = " + ( false && true | true ));
      System.out.println("[ok]  false &&(true | true)= " + ( false &&(true | true))); // ok
      System.out.println("[no] (false && true)| true = " + ((false && true)| true )); // no
      System.out.println("[??]  true | true && false = " + ( true | true && false ));
      System.out.println("[ok] (true | true)&& false = " + ((true | true)&& false )); // ok
      System.out.println("[no]  true |(true && false)= " + ( true |(true && false))); // no

      System.out.println("# [short-AND &&] before [short-OR ||] #");
      System.out.println("[??]  true || true && false = " + ( true || true && false ));
      System.out.println("[ok]  true ||(true && false)= " + ( true ||(true && false))); // ok
      System.out.println("[no] (true || true)&& false = " + ((true || true)&& false )); // no
      System.out.println("[??]  false && true || true = " + ( false && true || true ));
      System.out.println("[ok] (false && true)|| true = " + ((false && true)|| true )); // ok
      System.out.println("[no]  false &&(true || true)= " + ( false &&(true || true))); // no
   }

   static void demoEverythingBeforeAssignment() {
      System.out.println("## Precedence: Everything before (Compound) Assignment (RIGHT) ##");
      // Everything is before Assignment and Compound Assignment
      
      // Precedence: post : pre : */% : +- : >> : <> : == : & : ^ : | : && : || : =
      boolean u = true || false;
      System.out.println("boolean u = true || false // ... return " + u);
      System.out.println("same as: boolean u = (true || false);");

      System.out.println("# (Compound Assignments are RIGHT associative #");
      int x=100,y=20,z=3;
      int i=100,j=20,k=3;
      System.out.println("x="+x+",y="+y+",z="+z);
      System.out.println("i="+i+",j="+j+",k="+k);
      System.out.print(" x += y += z;  // ... returns " + (x += y += z));
      System.out.println("; x="+x+",y="+y+",z="+z);
      System.out.print(" i +=(j += k); // ... returns " + (i += j += k));
      System.out.println("; i="+i+",j="+j+",k="+k);
      System.out.println("(r += s)+= t;  // INVALID EXPRESSION");
   }
}
