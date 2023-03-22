package practice.algorithm.programmers;

import java.util.stream.IntStream;

/**
 * 문자 반복 출력하기
 * */
public class P120825 {
    public static void main(String[] args) {

    }

    class Solution {
        public String solution(String my_string, int n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < my_string.length(); i++) {
                char c = my_string.charAt(i);
                IntStream.range(0, n).forEach(j -> sb.append(c));
            }
            return sb.toString();
        }
    }

    class Solution2 {
        public String solution(String my_string, int n) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = my_string.split("");

            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[i].repeat(n));
            }
            return sb.toString();
        }
    }
}
