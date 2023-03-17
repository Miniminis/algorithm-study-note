package practice.algorithm.programmers;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120854
 * 배열 원소의 길이
 * */
public class P120854 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] solution(String[] strlist) {
            return Arrays.stream(strlist).mapToInt(String::length).toArray();
        }
    }
}
