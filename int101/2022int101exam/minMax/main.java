package minMax;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0,min = 0,a,b;

        System.out.print("Enter input count: ");
        a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print("Enter number: ");
            b = sc.nextInt();
            if (i == 1) max=min=i;
            if (b > max) max = b;
            if (b < min) min = b;
        }
        System.out.println("Max: "+max+" Min: "+min);
    }
}
