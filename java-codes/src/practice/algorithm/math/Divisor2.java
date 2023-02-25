package practice.algorithm.math;

/**
 * 약수 : n % x = 0 를 만족하는 값
 * */
public class Divisor2 {
    public static void main(String[] args) {
        int n = 100;

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            findDivisor(n, sb, i);
        }
        System.out.println("sb = " + sb);   //1 100 2 50 4 25 5 20 10
    }

    private static void findDivisor(int n, StringBuilder sb, int i) {
        if (n % i == 0) {
            sb.append(i).append(" ");

            if (n / i != i) {
                sb.append(n / i).append(" ");
            }
        }
    }
}
