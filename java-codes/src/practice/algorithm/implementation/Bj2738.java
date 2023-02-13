package practice.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2738
 * 행렬덧셈
 * 13m
 * */
public class Bj2738 {

    private static BufferedReader br;
    private static StringTokenizer st;
    private static int[][] a;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        a = new int[n][m];

        setArray(a, n, m);
        setArray(a, n, m);

        System.out.println(printArray(a, n, m));
    }

    private static String printArray(int[][] arr, int n, int m) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static void setArray(int[][] array, int n, int m) throws IOException {
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                array[i][j] += Integer.parseInt(st.nextToken());
            }
        }
    }
}
