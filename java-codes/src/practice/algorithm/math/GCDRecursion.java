package practice.algorithm.math;

public class GCDRecursion {
    public static void main(String[] args) {

        int a = 24;
        int b = 28;

        //유클리드 호제법은 a > b 를 충족해야한다.
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
