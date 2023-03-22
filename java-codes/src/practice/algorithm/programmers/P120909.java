package practice.algorithm.programmers;

/**
 * 제곱수 판별하기
 * */
public class P120909 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int n) {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n ? 1 : 2;
        }
    }

    class Solution2 {
        public int solution(int n) {
            return n % Math.sqrt(n) == 0 ? 1 : 2;
        }
    }
}
