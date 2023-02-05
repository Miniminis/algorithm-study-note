package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/20365
 * 블로그 2
 * 결과
 * - 초반에는 성공하다가 중간부터 실패. 하지만 원인을 모르겠음
 * - 2번 방법으로 풀었더니 결과값 성공!
 * - 18924 kb / 232 ms
 * 반성하기
 * 1. 초기접근시, string 의 가장 첫번째값을 base 로 두고 연산했었다.
 * - 배열을 순회하며 더 많은 색을 base 컬러로 삼는다.
 * 2. 단순히 색이 나오는 개수만 체크하면 되는 것이 아니라 색의 "뭉터기"를 세야한다. 색의 뭉태기가 많은 것을 전체 색으로 칠해야, 더 적게 칠할 수 있다.
 * */
public class Bj20365 {

    private static final char BLUE = 'B';
    private static final char RED = 'R';

    private static long blue = 0, red = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        String lines = br.readLine();

        //두개의 색이 연속되어 나온 "덩어리"를 센다. 그를 위해 blue, red count 를 각각 세어준다.
        //시작점 색을 기준색으로 두고 시작점 색에 맞는 count++

        char base = lines.charAt(0);
        countColor(base);

        for (int i = 1; i < n; i++) {
            char current = lines.charAt(i);
            if (current == base) {
                continue;
            }

            base = current;
            countColor(base);
        }

        System.out.println(blue > red ? red+1 : blue+1);
    }

    private static void countColor(char base) {
        if (base == BLUE) {
            blue++;
        }  else {
            red++;
        }
    }
}
