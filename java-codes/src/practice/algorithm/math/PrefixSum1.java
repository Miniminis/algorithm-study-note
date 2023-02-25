package practice.algorithm.math;

/**
 * 누적합
 * - 배열의 특정 구간의 합을 구할 때, 일반적으로 구하는 방법
 * * */
public class PrefixSum1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 2; i <= 4; i++) {
            sum += arr[i];
        }
        System.out.println(sum);    //12
    }
}
