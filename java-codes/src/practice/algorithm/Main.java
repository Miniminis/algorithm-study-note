package practice.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        int idx = 0;
        while(sc.hasNextInt()) {
            nums[idx] = sc.nextInt();
            idx++;
        }

        Arrays.sort(nums);

        boolean[] isPrime = new boolean[nums[n-1] + 1];

        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i*i <= isPrime.length; i++) {
            if (!isPrime[i]) {
                for (int j = i*i; j <= isPrime.length; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        int count = 0;
        for(int i = 0)
        for (int i = nums[0]; i <= nums[n-1]; i++) {
            for (int j = 0; j < nums.length; j++) {

            }
        }


    }
}
