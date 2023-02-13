package practice.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2744
 * 대소문자 바꾸기
 * 15m27s
 * */
public class Bj2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        //65 - 90
        //97- 122
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c > 90) {
                sb.append(Character.toChars(c - 32));
                continue;
            }
            sb.append(Character.toChars(c + 32));
        }
        System.out.println(sb);
    }
}
