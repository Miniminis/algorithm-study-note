package practice.algorithm.math;

import java.util.Arrays;

public class CombinationRepeated {

    private static int[] input;
    private static int[] output;
    private static int r;

    public static void main(String[] args) {
        input = new int[]{1, 2, 3, 4};
        r = 2;
        output = new int[r];

        combination(0, 0);
    }

    private static void combination(int depth, int start) {
        if (depth == r) {
            System.out.println(Arrays.toString(output));
            return;
        }

        for (int i = start; i < input.length; i++) {
            output[depth] = input[i];
            combination(depth+1, i);    //중복을 허용하므로, 같은 수 반복
        }
    }
}
