package practice.algorithm.math;

import java.util.Arrays;

/**
 * 소수 : 1과 자기자신으로만 나누어 떨어지는 1보다 큰 양의 정수
 * 문제
 * - M이상 N이하의 소수 모두 출력하기
 * 풀이
 * - 1부터 N까지 돌면서 isPrime 배열에 해당 인덱스가 소수인지 아닌지 결과값을 저장한다.
 * - n제곱근까지만 조사하면, 그 이후로는 검사할 필요가 없다.
 * - 특정 수가 소수이면, 해당 소수를 제외하고 그 소수의 배수를 모두 N까지의 범위에서 제거한다.
 * - 배열에서 true 인 값 중에서 M과 같거나 큰 값만 출력해주면 끝!
 * */
public class PrimeNumber2 {
    public static void main(String[] args) {

        int m = 1;
        int n = 100;

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i*i; j <= n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (isPrime[i] && i >= m) {
                sb.append(i).append(" ");
            }
        }

        System.out.println("prime = " + sb);
        //prime = 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
    }

}
