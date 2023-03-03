package practice.algorithm.math;

public class PermutationRepeated {

    private static int[] input;
    private static int[] output;
    private static int r;

    public static void main(String[] args) {
        input = new int[]{1, 2, 3, 4};

        r = 2;
        output = new int[r];

        permutation(0);
    }

    private static void permutation(int depth) {
        if (depth == r) {
            printOutput(output);
            return;
        }

        for (int i = 0; i < input.length; i++) {
            output[depth] = input[i];
            permutation(depth+1);
        }
    }

    private static void printOutput(int[] output) {
        for (int num : output) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
