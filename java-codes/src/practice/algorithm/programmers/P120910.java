package practice.algorithm.programmers;

/**
 * 세균증식
 * */
public class P120910 {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 5));
    }

    class Solution {
        public int solution(int n, int t) {
            for (int i = 1; i <= t; i++) {
                n *= 2;
            }
            return n;
        }
    }


    class Solution2 {
        public int solution(int n, int t) {
            return n << t;
            //2 << 10
            //7 << 15
        }
    }

    class Solution3 {
        public int solution(int n, int t) {
            return n * (int) Math.pow(2, t);
        }
    }
}
