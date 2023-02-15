package practice.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/4999
 * 아!
 * 1. 입력된 두 개의 문자열의 길이를 비교한다.
 * 2. 첫번째 문자열이 더 길면 go, 아니면 no 를 출력한다.
 * 3m
 * */
public class Bj4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String jaehwan = br.readLine();
        String doctor = br.readLine();

        if (jaehwan.length() >= doctor.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
