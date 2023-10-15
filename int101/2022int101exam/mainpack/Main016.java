package mainpack;

import objJet.Obj016;
import utilJet.Util016;

public class Main016 {
    public static void main(String[] args) {

        System.out.println(Util016.jet);

        System.out.println(Util016.compute016RightTriangleArea(4,5));
        System.out.println(Util016.compute016RightTriangleArea(-1,5));

        System.out.println(Util016.evaluate016(75.50));
        System.out.println(Util016.evaluate016(100.50));


        System.out.println(Util016.computeMagicJet(1,10,2));

        Obj016 testZ = new Obj016("016","Jet",016.0);
        Obj016 testY = new Obj016("016","Tej",016.0);

        System.out.println(testZ.getNameJet());
        testZ.setNameJet("NameJet");
        System.out.println(testZ.getNameJet());

        System.out.println(testZ);

        System.out.println(Obj016.compare(testZ,testY));

        System.out.println(testZ.isGreaterThan(testY));

    }
}
