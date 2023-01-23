package practice.algorithm.dac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11582
 * 치킨 TOP N
 * - 전체 8개
 * - if k=4, g=8/4=2, i = i+g until i < n {0, 2, 4, 6}
 * - if k=2, g=8/2=4, i = i+g until i < n {0, 4}
 * 접근방법
 * - 정공법으로 간다. 문제에서 주어진 명수 만큼 배열을 자르고, 각각에 대하여 소팅한 후, 합친다.
 * 결과
 * - 331832 kb / 6060 ms
 * */
public class Bj11582ArrayList {

    private static int n, k;
    private static List<Integer> chickens, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        chickens = new ArrayList<>();
        result = new ArrayList<>();

        while (st.hasMoreTokens()) {
            chickens.add(Integer.parseInt(st.nextToken()));
        }

        k = Integer.parseInt(br.readLine());

        sort();
        printChickens();
    }

    private static void sort() {
        int gap = n / k;

        for (int i = 0; i < n; i += gap) {
            List<Integer> temp = chickens.subList(i, i+gap);
            Collections.sort(temp);
            result.addAll(temp);
        }
    }

    private static void printChickens() {
        for (Integer r : result) {
            System.out.print(r + " ");
        }
    }
}
