package practice.algorithm.programmers;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 암호해독
 * */
public class P120892 {
    public static void main(String[] args) {

    }

    class Solution {
        public String solution(String cipher, int code) {
            StringBuilder sb = new StringBuilder();
            for (int i = code-1; i < cipher.length(); i+=code) {
                sb.append(cipher.charAt(i));
            }
            return sb.toString();
        }
    }

    class Solution2 {
        public String solution(String cipher, int code) {
            return IntStream.range(0, cipher.length())
                    .filter(i -> i % code == code - 1)
                    .mapToObj(i -> String.valueOf(cipher.charAt(i)))
                    .collect(Collectors.joining());
        }
    }
}
