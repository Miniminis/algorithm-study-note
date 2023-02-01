package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/20365
 * 블로그 2
 * 결과
 * - 실패 : 하지만 원인을 모르겠음
 * 반성하기
 * 1. 초기접근시, string 의 가장 첫번째값을 base 로 두고 연산했었다.
 * - 배열을 순회하며 더 많은 색을 base 컬러로 삼는다.
 * */
public class Bj20365 {

    private static final char BLUE = 'B';

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        String lines = br.readLine();

        long blue = 0;
        for (int i = 0; i < n; i++) {
            if (lines.charAt(i) == BLUE) {
                blue++;
            }
        }

        long red = n-blue;
        System.out.println(blue > red ? red+1 : blue+1);
    }
}
