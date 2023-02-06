package practice.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/22864
 * 피로도
 * - 하루 24시간, 피로도 max <= m
 * - 피로도 : +a, -c
 * - 일 : -b, -0
 * 결과
 * - 14132 kb / 120 ms
 * 회고
 * 1. 너무 돌려서 어렵게 생각했다. 단순하게 전체 피로도에서 일을 하고, 휴식을 취하는 것을 적절한 순서로 번갈아가면서 해주면 된다.
 * - 반드시 일을 먼저 해봐야한다. 피로도는 0에서 시작하고 음수일수는 없기 때문이다.
 * - 일을 먼저 해보고, 한계치를 넘지 않으면, 일한 시간을 증가시켜주고, 동시에 일의 양도 증가시켜준다.
 * - 만약에 한계치를 넘을 경우, 0과 비교하여 p-c 만큼 한 수치를 다시 넣어준다.
 *      - 계속 일한 시간이 한계치를 넘을 경우, if 문을 통과할 것이다.
 * - 전체 반복의 횟수는 24시간 만큼만 해주도록 한다.
 * */
public class Bj22864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int hour = 0, p = 0, answer = 0;
        while(hour < 24) {
            hour++;
            if(p + a <= m) {
                answer += b;
                p += a;
                continue;
            }
            p = Math.max(p - c, 0);
        }
        System.out.print(answer);

    }
}
