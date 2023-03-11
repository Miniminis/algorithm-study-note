package practice.algorithm.programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120808
 * 분수의 덧셈
 * 1. 분모를 같게 만들어준다.
 * 2. 분자간 덧셈을 한다.
 * 3. 결과값에서 기약분수가 될때까지 분자와 분모를 공약수로 나누어준다.
 * */
public class P120808 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int numer = numer1 * denom2 + numer2 * denom1;
            int denom = denom1 * denom2;

            int gcd = gcd(numer, denom);

            return new int[]{numer / gcd, denom / gcd};
        }

        public int gcd(int num1, int num2) {
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            if (num2 == 0) {
                return num1;
            }

            return gcd(num2, num1 % num2);
        }
    }

    static class Solution2 {
        public int[] solution(int denum1, int num1, int denum2, int num2) {
            int[] result = new int[2];
            // 분모의 최소공배수를 구한다.
            result[0] = denum1*num2 + denum2*num1;
            result[1] = num1*num2;
            int min = (result[0] > result[1])? result[0]: result[1];
            int gcd = 0;
            for (int i = 1; i <= min; i++) {
                if (result[0] % i == 0 && result[1] % i == 0)
                    gcd = i;
            }
            result[0] = result[0]/gcd;
            result[1] = result[1]/gcd;

            return result;
        }
    }
}
