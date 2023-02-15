package practice.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10757
 * 큰 수 A+B
 * 1. 서로 다른 두 수 a, b 를 입력받는다.
 * 2. BigInt 타입으로 계산한다.
 * 28m35s
 * */
public class Bj10757_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        System.out.println(a.add(b));
    }
}
