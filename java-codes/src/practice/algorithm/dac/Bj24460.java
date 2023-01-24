package practice.algorithm.dac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/24460
 * 특별상이라도 받고 싶어
 * - 특별상은 1명만
 * - 대회장을 4개로 나누어, 2번째로 작은 번호를 선택 -> 재귀적으로 반복. 마지막 번호 = 특별상 번호
 * - 입력 : n, 의자 추첨번호 n*n 행렬. 중복 없음.
 * - 출력 : 특별상을 받을 대상 번호
 * 접근방법
 * - 전체를 작은 단위로 나누어 해를 구하는 것을 재귀적으로 반복하는 전형적인 분할정복문제.
 * - 재귀함수
 *   - 숫자가 하나만 남을 때까지 (n==1) 재귀적으로 함수를 호출한다. n==1이면, 해당 그래프의 값을 반환한다.
 *   - 매번 리스트는 소팅한 뒤, 두번째 값을 반환한다.
 * 결과
 * - 107480 kb / 660 ms
 * - 27 min
 * */
public class Bj24460 {

    private static int[][] chairs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        chairs = new int[n][n];

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                chairs[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(findChair(0, 0, n));
    }

    private static int findChair(int x, int y, int n) {
        if (n == 1) {
            return chairs[x][y];
        }

        int[] array = {
                findChair(x, y, n / 2),
                findChair(x + n/2, y, n / 2),
                findChair(x, y + n / 2, n / 2),
                findChair(x + n / 2, y + n / 2, n / 2)
        };

        Arrays.sort(array);
        return array[1];        //두번째로 작은값
    }
}
