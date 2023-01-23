package practice.algorithm.dac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/11582
 * 치킨 TOP N
 * - 전체 8개
 * - if k=4, g=8/4=2, i = i+g until i < n {0, 2, 4, 6}
 * - if k=2, g=8/2=4, i = i+g until i < n {0, 4}
 * 접근방법
 * - merge sort 를 이용한다.
 * - 중간에 소팅을 중단할 조건을 구한다.
 * 결과
 * - 시간초과
 * */
public class Bj11582MergeSort {

    private static int n, k;
    private static int[] chickens, temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        chickens = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        temp = new int[chickens.length];
        k = Integer.parseInt(br.readLine());

        mergeSort(0, n-1);
        printChickens();
    }

    private static void printChickens() {
        for (int i = 0; i < chickens.length; i++) {
            System.out.print(chickens[i] + " ");
        }
    }

    private static void mergeSort(int i, int j) {
        if (i == j) {
            return;
        }

        int mid = (i+j)/2;
        mergeSort(i, mid);
        mergeSort(mid+1, j);
        merge(i, mid, j);
    }

    private static void merge(int i, int mid, int j) {
        if ((j-i) > n/k) {
            return;
        }

        int p = i; int q = mid+1; int r = i;

        while (p <= mid && q <= j) {
            if (chickens[p] < chickens[q]) {
                temp[r++] = chickens[p++];
            } else {
                temp[r++] = chickens[q++];
            }
        }
        while (p <= mid) {
            temp[r++] = chickens[p++];
        }
        while (q <= j) {
            temp[r++] = chickens[q++];
        }
        for (int s = 0; s <= j; s++) {
            chickens[s] = temp[s];
        }
    }
}
