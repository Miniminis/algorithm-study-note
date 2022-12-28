package practice.algorithm.recursion;

public class SearchMaxFromBegin {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 100, 55, 4, -100};
        System.out.println("findMax(arr, 0, arr.length-1) = " + findMax(arr, 0, arr.length - 1));;
    }

    private static int findMax(int[] arr, int begin, int end) {
        if (begin == end) {
            return arr[begin];
        }

        return Math.max(arr[begin], findMax(arr, begin+1, end));
    }

    /**
     * findMax(arr, 0, arr.length-1) = 100
     * */
}
