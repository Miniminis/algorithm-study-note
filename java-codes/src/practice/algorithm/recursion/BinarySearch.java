package practice.algorithm.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        String[] strings = new String[]{"a", "v", "e", "p", "w", "b"};
        String target = "w";
        System.out.println("binarySearch(strings, target, 0, strings.length-1) = " + binarySearch(strings, target, 0, strings.length - 1));;
    }

    private static int binarySearch(String[] strings, String target, int begin, int end) {
        int middle = (begin + end) / 2;
        int result = target.compareTo(strings[middle]);
        if (result == 0) {
            return middle;
        }

        if (result < 0) {
            return binarySearch(strings, target, begin, middle-1);
        }

        return binarySearch(strings, target, middle+1, end);
    }
}
