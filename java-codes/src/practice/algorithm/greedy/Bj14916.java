package practice.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/14916
 * 거스름돈
 * - 동전의 개수가 최소가 되도록 거슬러 주어야 한다.
 * 접근방식
 * - 주의할점 : 무조건 5원나누고 -> 2원나누기로 진행하면 안된다.
 * - 1부터 차례대로 수를 구해보며 규칙을 찾는다.
 *      i 1  2 3 4 5 6
 *      v -1 1 -1 2 1 3
 * 방법 1. 6부터 순회를 하면서 min(d[i-2], d[i-5]) 값을 찾는다.
 *      -> 이 방법은 어떤 식으로 유추를 해야 나오는지 감을 못잡겠다.
 * 방법 2. 5로 나눌 수 있을 때까지 -2 하면서 카운트한다.
 *      -> 이 방법은 직관적이다. 한번에 이해할 수 있어서 이 방법으로 풀기로 한다.
 * 결과
 * - 14224 kb / 132 ms
 * 반성하기
 * 1. 문제 해결의 아이디어를 쉽게 떠올리지 못했다.
 * - 5로 나누거나 2로 빼는 연산, 두개만 가능하다고 애초에 생각했다면, 접근이 훨씬 쉬웠을 것이다.
 * */
public class Bj14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (true) {
            if (n % 5 == 0) {
                count += n / 5;
                break;
            }

            n -= 2;
            count++;

            if (n <= 0) {
                count = -1;
                break;
            }
        }

        System.out.println(count);
    }
}
