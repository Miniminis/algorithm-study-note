package practice.algorithm.programmers;

import java.util.Scanner;

/**
 * 직각삼각형 출력하기
 * */
public class P120823 {
    public static void main(String[] args) {

    }

    public class Solution {
        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }


    class Solution2 {
        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println("*".repeat(i));
            }
        }
    }

}
