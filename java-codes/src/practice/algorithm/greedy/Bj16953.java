package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/16953
 * A->B
 * 사용 가능한 옵션 : *2, *10+1
 * 목표 : A->B 로 만드는데 드는 최소 연산의 횟수
 * 규칙찾기
 * 1. /2 -> -1 /10 ->
 * 2. 40020/10 = 4002/2 -> 2000/10=200
 * 3. 42/2 = 20/10=2
 *
 * 결과
 * - 14180 kb / 120 ms - while
 * - 14200 kb / 136 ms - dfs
 * 되돌아보기
 * 1. 초기에는 홀수값이면 무조건 (b-1)/10 연산을, 짝수값이면 절반으로 나누기를 하면 된다고 1차원적으로 생각했다.
 * - 그러나 결과적으로는 (b-1)%10==0 이나 b%2==0 일때만 B->A 를 만들 수 있는 상태이다.
 * */
public class Bj16953 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        System.out.println(dfs(0, a, b));
    }

    private static long dfs(long count, long a, long b) {
        count++;

        if (a == b) {
            return count;
        }

        if (a > b) {
            return -1;
        }

        if (b % 2 == 0) {
            b /= 2;
            return dfs(count, a, b);
        }

        if ((b-1) % 10 == 0) {
            b = (b-1) / 10;
            return dfs(count, a, b);
        }

        return -1;
    }
}
