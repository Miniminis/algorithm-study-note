package practice.algorithm.recursion;

public class SearchMaxFromMiddle {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 100, 55, 4, -100};
        System.out.println("findMax(arr, 0, arr.length-1) = " + findMax(arr, 0, arr.length - 1));;
    }

    private static int findMax(int[] arr, int begin, int end) {
        if (begin == end) {
            return arr[begin];
        }

        int middle = (begin + end) / 2;

        int max1 = findMax(arr, begin, middle);
        int max2 = findMax(arr, middle+1, end);

        return Math.max(max1, max2);
    }

    /**
     * findMax(arr, 0, arr.length-1) = 100
     * */
}
