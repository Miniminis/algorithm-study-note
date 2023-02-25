package practice.algorithm.math;

/**
 * 합공식
 * - 1부터 10까지의 합 구하기
 * */
public class Sum1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);     //55
    }
}
