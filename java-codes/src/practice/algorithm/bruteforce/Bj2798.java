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
 * 결과
 * - 14480 kb / 132 ms
 * */
public class Bj2798 {
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
            for (int y = x-1; y >= 0; y--) {
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
