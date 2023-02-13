package practice.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1330
 * 두 수 비교하기
 * */
public class Bj1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        if (a > b) {
            sb.append(">");
        } else if (a < b) {
            sb.append("<");
        } else if (a == b) {
            sb.append("==");
        }

        System.out.println(sb);
    }
}
