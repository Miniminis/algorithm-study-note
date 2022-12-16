package practice.algorithm.math;

public class Permutation {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int r = 2;

        int[] output = new int[r];
        boolean[] visited = new boolean[input.length];

        permutation(input, visited, output, 0, input.length, r);

    }

    private static void permutation(int[] input, boolean[] visited, int[] output, int depth, int inputLength, int r) {
        if (depth == r) {
            printOutput(output, r);
            return;
        }

        for (int i = 0; i < inputLength; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = input[i];
                permutation(input, visited, output, depth+1, inputLength, r);
                visited[i] = false;
            }
        }
    }

    private static void printOutput(int[] output, int r) {
        for (int num : output) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
