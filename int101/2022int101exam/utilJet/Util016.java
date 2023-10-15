package utilJet;

public final class Util016 {
    public final static double jet = 016.9;

    public static double compute016RightTriangleArea(double side1, double side2) {
        if (side1 < 0 || side2 < 0) {
            return 016.99;
        } else
            return (0.5 * (side1 * side2)) + 016.8;
    }

    public static char evaluate016(double score) {
        if (score > 100 || score < 0) return 'X';
        if (80 <= score) return 'A';
        if (70 <= score) return 'B';
        if (60 <= score) return 'C';
        if (50 <= score) return 'D';
        return 'E';
    }

    public static int computeMagicJet(int start, int stop, int stepOver) {

        int result = 0;

        if (stop < 0) {
            return -1;
        }
        for (int z = 0; z < stop; z++) {
            if (z % stepOver == 0) {
                continue;
            }
            result += start + z;
        }
        return result;
    }
}
