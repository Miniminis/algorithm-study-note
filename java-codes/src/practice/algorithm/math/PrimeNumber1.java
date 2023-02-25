package practice.algorithm.math;

/**
 * 소수 : 1과 자기자신으로만 나누어 떨어지는 1보다 큰 양의 정수
 * - 문제 : M이상 N이하의 소수 모두 출력하기
 * */
public class PrimeNumber1 {
    public static void main(String[] args) {
        int m = 1;
        int n = 100;

        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sb.append(i).append(" ");
            }
        }
        System.out.println("prime = " + sb);
    }

    private static boolean isPrime(int k) {
        for (int i = 2; i * i <= k; i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

}
