package practice.algorithm.math;

public class LCM {
    public static void main(String[] args) {

        int a = 8;
        int b = 10;

        //유클리드 호제법은 a > b 를 충족해야한다.
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(lcm(a, b));
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }


}
