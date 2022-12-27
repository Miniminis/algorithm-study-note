package practice.algorithm.recursion;

public class PrintString {
    public static void main(String[] args) {
        String s = "elephant";
        printString(s);
    }

    private static void printString(String s) {
        if (s.length() == 0) {
            return;
        }

        System.out.println(s.charAt(0));
        printString(s.substring(1));
    }

    /**
     * e
     * l
     * e
     * p
     * h
     * a
     * n
     * t
     * */
}
