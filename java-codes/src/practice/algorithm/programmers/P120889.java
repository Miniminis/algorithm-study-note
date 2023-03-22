package practice.algorithm.programmers;

import java.util.Arrays;

/**
 * 삼각형의 완성조건
 * */
public class P120889 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int[] sides) {
            Arrays.sort(sides);
            return sides[0] + sides[1] > sides[2] ? 1 : 2;
        }
    }

    class Solution2 {
        public int solution(int[] sides) {
            int a = sides[0] + sides[1];
            int b = sides[1] + sides[2];
            int c = sides[0] + sides[2];

            if (a <= 2 || b <= 2 || c <= 2) {
                return 2;
            }
            return 1;
        }
    }
}
