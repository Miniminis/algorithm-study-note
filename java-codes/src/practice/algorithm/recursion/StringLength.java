package practice.algorithm.recursion;

public class StringLength {
    public static void main(String[] args) {
        String s = "elephant";
        System.out.println("stringLengthCalculator(s) = " + stringLengthCalculator(s));
    }

    private static int stringLengthCalculator(String s) {
        if (s.length() == 0) {
            return 0;
        }

        return 1 + stringLengthCalculator(s.substring(1));
    }
}
