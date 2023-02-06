package practice.algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/15721
 * 번데기
 * - 8 2 0 : 뻔 데기 "뻔" -> 2
 * - 4 6 1 : 뻔 데기 뻔 데기 뻔 뻔 데기 데기 뻔 데기 뻔 "데기" 뻔 뻔 뻔 데기 데기 데기
 *
 * - 0 1 0 1 0 0 1 1 = 0101+0(n+1)+1(n+1)
 * - 0 1 0 1 0 0 0 1 1 1
 * - 0 1 0 1 0 0 0 0 1 1 1 1
 * 결과
 * - 14176 kb / 124 ms
 * 반성하기
 * - 4회의 시도 끝에 맞췄다. 원인이 무엇인가?
 * 1. i의 값을 증가시켜주는 과정에서 ++i 해주어야할 것을 i++해주었다. -> 후위증감연산자를 제대로 이해하지 못한 것이다.
 * - 매개변수로 전달되는 과정에서 i++해주면 +1 된 값이 매개변수로 전달되어 getGameString(i+1) 값처럼 나올 것이라고 예상했다.
 * - 그러나 매개변수로 i 가 전달되고 ++ 은 그 이후에 시행된다는 것을 알 수 있었다.
 * 2. 전체 인덱스를 세지 않고, string 에 해당하는 인덱스만 세고 있었다.
 * - 기존 코드에는 int s 값을 정의하지 않고, k 값을 인덱스로 생각하고 연산하고 있었다.
 * - 그러나 위와 같이 생각할 경우, 기존 str 값에서 끊긴 부분부터 새로운 str 값에서 인덱스가 시작되어야 하는데, 해당 부분을 놓치고 다시 0부터 시작하게 된다.
 * - 끝나는 지점을 계속 기억하기 위해서 s 변수 값을 추가하였고, 최종적으로 답을 구할 때는 n만큼 나누어주어 인덱스를 구할 수 있도록 하였다.
 * */
public class Bj15721 {

    private static final char BBUN = '0';
    private static final char DAEGI = '1';

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        char call = br.readLine().charAt(0);

        System.out.println(startGame(0, -1, n, t, call));
    }

    private static int startGame(int i, int s, int n, int t, char call) {
        String str = getGameString(++i);

        for (int k = 0; k < str.length(); k++) {
            s++;
            if (str.charAt(k) != call) {
                continue;
            }

            t--;
            if (t == 0) {
                return s % n;
            }
        }

        return startGame(i, s, n, t, call);
    }

    private static String getGameString(int i) {
        StringBuilder sb = new StringBuilder("0101");
        for (int k = 0; k <= i; k++) {
            sb.append(BBUN);
        }
        for (int k = 0; k <= i; k++) {
            sb.append(DAEGI);
        }
        return sb.toString();
    }
}
