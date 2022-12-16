package practice.algorithm.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_15649 {
    private static int n, m;

    public static void main(String[] args) throws IOException {
        input();

        int[] output = new int[m];
        boolean[] visited = new boolean[n];

        permutation(n, m, 0, visited, output);
    }

    private static void permutation(int n, int m, int depth, boolean[] visited, int[] output) {
        if (depth == m) {
            printOutput(output);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = i+1;
                permutation(n, m, depth+1, visited, output);
                visited[i] = false;
            }
        }
    }

    private static void printOutput(int[] output) {
        for (int o : output) {
            System.out.print(o + " ");
        }
        System.out.println();
    }


    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }
}
