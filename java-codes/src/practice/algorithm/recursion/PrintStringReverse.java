package practice.algorithm.recursion;

public class PrintStringReverse {
    public static void main(String[] args) {
        String s = "elephant";
        printReverseOrder(s);
    }

    private static void printReverseOrder(String s) {
        if (s.length() == 0) {
            return;
        }

        printReverseOrder(s.substring(1));
        System.out.println(s.charAt(0));
    }

    /**
     * t
     * n
     * a
     * h
     * p
     * e
     * l
     * e
     * */
}
