package practice.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2739
 * 구구단
 * 5m
 * */
public class Bj2739 {

    private static final String SPACE = " ";
    private static final String MULTIPLY = "*";
    private static final String EQUAL = "=";
    private static final String NEWLINE = "\n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            sb.append(n)
                    .append(SPACE).append(MULTIPLY)
                    .append(SPACE).append(i)
                    .append(SPACE).append(EQUAL)
                    .append(SPACE).append(n * i)
                    .append(NEWLINE);
        }
        System.out.println(sb);
    }
}
