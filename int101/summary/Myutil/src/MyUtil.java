public final class MyUtil {
    MyUtil() {

    }

    static int factorial(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("i must be non-negative");
        }

        int result = 1;
        for (int j = 2; j <= i; j++) {
            result *= j;
        }
        return result;
    }

    static int summation(int i, int j){
//        int result = 0;
//        if (i > j){
//            for (int k = 0; k < i ; k++) {
//                result += k;
//            }
//        }else{
//            for (int k = 0; k < j; k++) {
//                result += k;
//            }
//        }
//        if (i == j){
//            return i;
//        }
//        return result;
        int sum = 0;
        int min = i<j ? i : j;
        int max = i>j ? j : i;
        for (;min <= max;min++);
        return sum;
    }
    public static int fibonacci(int i){
        if (i < 0) throw new IllegalArgumentException("False");
        if (i < 2) return i;
        return fibonacci(i-2) + fibonacci(i-1);
    }
}
