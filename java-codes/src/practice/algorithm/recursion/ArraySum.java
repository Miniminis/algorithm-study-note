package practice.algorithm.recursion;

public class ArraySum {
    public static void main(String[] args) {
        int[] numArr = new int[]{1, 10, 100, 1000, 10000};
        System.out.println("sumArray(numArr) = " + sumArray(numArr, 0));;
    }

    private static int sumArray(int[] numArr, int index) {
        if (index == numArr.length-1) {
            return numArr[index];
        }

        return numArr[index] + sumArray(numArr, index + 1);
    }

    /**
     * sumArray(numArr) = 11111
     * */
}
