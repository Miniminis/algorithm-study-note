package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/1343
 * 폴리오미노
 * - string api 를 이용한다. (https://airzinc.tistory.com/entry/백준-1343-JAVA)
 * */
public class Bj1343 {
    private static final String A = "AAAA";
    private static final String B = "BB";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(poliomino(input));
    }

    private static String poliomino(String input) {
        String firstResult = input.replaceAll("XXXX", A);
        String result = firstResult.replaceAll("XX", B);

        if (result.contains("X")) {
            return "-1";
        }
        return result;
    }
}
