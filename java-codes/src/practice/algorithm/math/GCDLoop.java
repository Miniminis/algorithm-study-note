package practice.algorithm.math;

public class GCDLoop {
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
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;   //b == 0 이다.
    }
}
