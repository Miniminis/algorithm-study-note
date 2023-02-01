package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/20300
 * 서강근육맨
 * - 두개의 운동기구의 근손실 합을 최소화
 * - 1 2 3 4 5 : 5 5 5 -> m=5
 * - 1 4 9 11 20 : 20
 * - 6 7 8 9 10
 * -> 홀수일때는 : 마지막 값에 맞추도록 최소화맨
 * 결과
 * - 19584 kb / 260 ms / 30min
 * 복습하기
 * 1. 접근은 비슷하게 했으나, 확신이 없었다.
 * - 홀수일 때에는 맨마지막 값을 최대로 둔다.
 * - 나머지 가장 큰 값과 가장 작은 값을 배열 양끝에서 더해주는 방식
 * 2. 숫자 범위가 크면 long 으로 타입 고려하자.
 * 3. Long.MIN_VALUE : 최대값을 구하는 문제이다. 따라서 기준값을 가장 최소값으로 두어야 이후의 연산이 1회라도 발생하면 해당 값으로 덮어씌워지게 된다.
 * */
public class Bj20300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] array = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        Arrays.sort(array);

        long max = Long.MIN_VALUE;

        if (n % 2 != 0) {
            max = array[n-1];
            n = n-1;
        }

        for (int i = 0; i < n/2; i++) {
            long result = array[i] + array[n-1-i];
            if (result > max) {
                max = result;
            }
        }

        System.out.println(max);
    }
}
