package practice.algorithm.math;

/**
 * 누적합
 * - 배열의 특정 구간의 합을 구할 때, [b까지의 누적합 - a까지의 누적합] 방식으로 구하는 방법
 * */
public class PrefixSum2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] preSum = new int[arr.length];

        preSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            preSum[i] = preSum[i-1] + arr[i];
        }

        System.out.println(preSum[4]-preSum[1]);    //12 : s[y]-s[x-1]
    }
}
