package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/1758
 * 알바생 강호
 * - 목표 : 순서를 적절하게 바꿀 때, 팁이 최대값이 되도록
 * - 어떤 때에 팁이 최대값이 될까?
 *      - 팁을 많이 주려는 사람을 앞순서로 끌어오면 된다.
 *      - 팁을 적게 주려고 했던 사람은 뒤로 밀릴수록 음수확률이 높아지기 때문에 0으로 처리될 확률이 높다.
 * 1 <= n <= 100,000
 * 3 2 3
 * - 3 + 3-1 + 2-2 = 3+2+0 = 5
 * - 3 + 2-1 + 3-2 = 3+1+1 = 5
 * 7 8 6 9 10
 * - 7 + 7+ 4+ 6 + 6 = 30
 * - 10 9 8 7 6 : 10 + 8 + 6 + 4 + 2 = 30
 * 1 1 1 1 2
 * - 1 1 1 1 2 -> 1 + 0 + 0 + 0 + 0 = 1
 * - 2 1 1 1 1 -> 2
 * 1 2 3
 * - 1 2 3 : 1 + 1 + 1 = 3
 * - 3 2 1 : 3 + 1 + 0 = 4
 * 결과
 * - 22240 kb / 236 ms
 * 반성하기
 * 1. 어차피 팁의 값이 0 이하가 되는 순간 그 이후의 배열 값은 계산할 필요도 없다.
 *      내림차순으로 탐색하고, 순서도 더 뒤이기 때문에 계속 음수일 것이기 떄문.
 * */
public class Bj1758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] line = new int[n];

        for (int i = 0; i < n; i++) {
            line[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(line);

        long total = 0;
        for (int i = 0; i < n; i++) {
            int finalTip = line[n-i-1] - i;
            if (finalTip < 0) {
                break;
            }
            total += finalTip;
        }

        System.out.println(total);
    }
}
