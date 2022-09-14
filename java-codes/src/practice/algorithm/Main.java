package practice.algorithm;

public class Main {

    public static void main(String[] args) {
        int result = gcd(7, 7);
        System.out.println("result = " + result);
    }

    public static int gcd(int m, int n) {
        if (m < n) {
            int temp = 0;
            temp = m;
            m = n;
            n = temp;
        }

        if (m%n == 0) {
            return n;
        }

        return gcd(n, m%n);
    }

}
