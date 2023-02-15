package practice.algorithm.implementation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/3003
 * 킹, 퀸, 룩, 비숍, 나이트, 폰
 * 1. 체스판에 원래 있어야 하는 개수를 1차원 배열 base[] 로 정의한다.
 * 2. 현재 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수를 입력받는다. - current[]
 * 3. 현재 배열을 첫 인덱스부터 순회하며, base 와 비교해서 부족하거나 빼야할 값을 string builder 에 쌓는다.
 * 4. sb 를 프린트한다.
 * 10m19s
 * */
public class Bj3003 {
    public static void main(String[] args) throws IOException {
        int[] base = {1, 1, 2, 2, 2, 8};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] current = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::new).toArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < current.length; i++) {
            int gap = base[i] - current[i];
            sb.append(gap).append(" ");
        }

        System.out.println(sb);
    }
}
