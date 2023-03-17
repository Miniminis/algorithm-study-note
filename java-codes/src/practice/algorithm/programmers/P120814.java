package practice.algorithm.programmers;

public class P120814 {
    public static void main(String[] args) {

    }

    static class Solution {
        private final int SLICE_SIZE = 7;

        public int solution(int n) {
            int answer = n / SLICE_SIZE;
            return n % SLICE_SIZE > 0 ? answer + 1 : answer;
        }
    }
}
