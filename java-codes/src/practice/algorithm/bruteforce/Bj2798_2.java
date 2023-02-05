package practice.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2798
 * 블랙잭
 * goal : 주어진 숫자 3개를 조합하여 M을 넘지 않는 최대의 수를 구해야한다.
 * - 두번째 방법에서는 조금이라도 탐색의 범위를 줄여주려고 한다.
 *      - 첫번째 카드가 이미 M보다 크면 skip
 *      - 첫번째카드 + 두번째 카드 가 이미 M보다 크면 skip
 * 결과
 * - 첫번째 : 14480 kb / 132 ms
 * - 두번째 : 14396 kb / 128 ms -> 확실하게 두번째 방법으로 탐색 범위를 좁힌 것이 시간이 훨씬 빠른 것을 알 수 있다.
 * */
public class Bj2798_2 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n, m
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // for 1~n, card[]
        int[] card = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // sort card[]
        Arrays.sort(card);

        // for card[]
        int result = Integer.MIN_VALUE;
        for (int x = n-1; x >= 0; x--) {
            if (card[x] > m) continue;

            for (int y = x-1; y >= 0; y--) {
                if (card[x] + card[y] > m) continue;

                for (int z = y-1; z >= 0; z--) {
                    int number = card[x] + card[y] + card[z];
                    if (number <= m && number > result) {
                        result = number;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
