package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/20115
 * 에너지 드링크
 * - 목표 : 에너지 드링크의 양을 최대로 만든다.
 * - d[] = 3, 2, 10, 9, 6
 * - d[i] = d[i] + d[i+1]/2
 * - d[n-1] 을 출력
 * - 최대값이 되는 조건 : 최대값을 기준점으로 나머지 음료를 절반으로 나누어 더하면 된다.
 *      - 10 9 6 3 2
 *      - 495 100 80 77 65 45 39 27 9 1
 *      - 495.5 + 104.5 + 93.5 + 86.5 +
 * 결과
 * - 32372 kb / 448 ms
 * 반성하기
 * 1. 최대값을 기준으로 나머지를 절반씩 하여 더한다는 아이디어를 떠올렸으나 확신이 없었다.
 * - 왜 확신이 없었나?
 *      - 배열의 양 끝에서 두개씩 골라서 연산한 뒤, 마지막 1개가 남을 때까지 올라가는 방법이 괜찮다고 생각했다.
 *      - 하지만 실제 코드를 짜보니, 결과값은 최대가 아니게 되었다.
 * 2. 나누기가 들어있으므로 언제든지 소수점 값이 나올 수 있다. float 보다 정확도가 높은 double 을 사용한다.
 * */
public class Bj20115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] drinks = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(drinks);

        double sum = drinks[n-1];
        for (int i = n-2; i >= 0; i--) {
            sum += (double) drinks[i]/2;
        }

        System.out.println(sum);
    }

}
