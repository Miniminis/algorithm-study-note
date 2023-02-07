package practice.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/18312
 * 시각
 * 결과
 * - 14068 kb / 132 ms
 * 회고
 * 1. 역시 너무 복잡하게 생각했다. 브루트포스는 직관적으로 생각하고, 직관적으로 코드를 짜야한다.
 * 2. 시간에서 특정 수가 포함되는 조건을 어렵게 생각했다. 앞자리가 k이거나 뒷자리가 k인 수를 구해야하므로,
 *  10으로 나눈 몫이 k이거나 나눈 나머지가 k인 값을 찾으면 된다. 쓸데없이 어렵게 식을 짰다.
 * 3. 처음 접근했던 3중 for 문 방식이 맞았다. 다만, 한번 꼬아서 생각했고, 전체 탐색을 줄이려다가 오히려 정답과 멀어지게 되었다.
 * */
public class Bj18312 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int h = 0; h <= n; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if (hasNumber(h, m, s, k)) count++;
                }
            }
        }

        System.out.println(count);
    }

    private static boolean hasNumber(int h, int m, int s, int k) {
        return h/10==k || h%10==k || m/10==k || m%10==k || s/10==k || s%10==k;
    }
}

// 시 : 0-23
    //3:00:00 - 3:59:59 -> 60*60*2 = 7200
// 분 : 0-59
    //??:03:00 -> 5*60*15 = 4500
// 초 : 0-59
    //??:??:03 -> 5*45*15 = 3375
//3, 13
//3, 13, 23, 33, 43, 53 6 + 10 - 1 = 15
//30, 31, 32, ... 39
//k-3%10==0 or
//1. (i-k)%10==0
//2. Or i/10-k==0

/*
* 00:00:00 - 23:59:59
* 시간 count * 60 * 60
* (N-시간 count) * 분 count * 60
* (N-시간 count) * (59-분count) * 초 count
* */
