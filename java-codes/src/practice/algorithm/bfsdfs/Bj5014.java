package practice.algorithm.bfsdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://www.acmicpc.net/problem/5014
 * 40min /
 * 스타트링크
 * - 건물구조 : 전체 F / 스타트링크 G / 강호 S
 * - 엘리베이터 : U 위로 u층 이동 / D 아래로 d층 이동
 * 접근방법
 * - 최소비용을 측정하는 문제
 * - 시작점부터 위/아래로 이동하는 경우의 수를 각각 bfs 로 계산한다.
 * - 각 층으로 이동할 때마다 이동횟수인 1을 추가하고, 한번 갱신된 위치는 업데이트 되지 않는다.
 * */
public class Bj5014 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputs = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int f = inputs[0];
        int s = inputs[1];
        int g = inputs[2];
        int u = inputs[3];
        int d = inputs[4];

        int[] building = new int[f+1];
        int[] direction = {u, -d};

        int result = bfs(building, f, s, g, direction);
        if (result >= 0) {
            System.out.println(result);
            return;
        }
        System.out.println("use the stairs");
    }

    private static int bfs(int[] building, int f, int s, int g, int[] direction) {
        building[s] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == g) {
                return building[g] - 1;
            }

            for (int j : direction) {
                int next = current + j;

                if (next < 0 || next > f) {
                    continue;
                }

                if (building[next] != 0) {
                    continue;
                }

                building[next] = building[current] + 1;
                queue.add(next);
            }
        }

        return - 1;
    }
}
