package practice.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2753
 * 윤년
 * 3m9s
 * */
public class Bj2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}
