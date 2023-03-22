package practice.algorithm.programmers;

/**
 * 주사위의 개수
 * */
public class P120845 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int[] box, int n) {
            int p = box[0] / n;
            int q = box[1] / n;
            int h = box[2] / n;
            return p * q * h;
        }
    }
}
