import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random rd = new Random();
//        int random = rd.nextInt(1, 100);
//
//        while (true) {
//
//            System.out.print("Enter the answer: ");
//            int input = sc.nextInt();
//            if (random == input) {
//                System.out.println("Your correct!! \nthe answer is " + random);
//                break;
//            } else if (input > random) {
//                System.out.println("It higher than the answer try lower number");
//            } else if (input < random) {
//                System.out.println("It lower than the answer try higher number");
//            } else {
//                System.out.println("Try Again!");
//            }
//        }
        boolean x = true;
        int sum = 0;
        int j = 1;
        int sumj = 0;
        while (x) {
            for (int i = 1; i < 100; i++) {
                if (i % 5 != 0) {
                    sum += i;
                }
            }
            x = false;
        }
        System.out.println("Result: " + sum);

        while (j <= 100) {

            if (j % 5 == 0) {
                j++;
                continue;
            }
            sumj += j;
            j++;
        }
        System.out.println("Result: " + sumj);
    }
}

