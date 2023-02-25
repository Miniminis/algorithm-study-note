package practice.algorithm.math;

/**
 * 약수 : n % x = 0 를 만족하는 값
 * */
public class Divisor1 {
    public static void main(String[] args) {
        int n = 100;

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sb.append(i).append(" ");
            }
        }
        System.out.println("sb = " + sb);   //1 2 4 5 10 20 25 50 100
    }
}
