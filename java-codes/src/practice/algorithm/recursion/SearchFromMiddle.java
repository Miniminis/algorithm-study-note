package practice.algorithm.recursion;

public class SearchFromMiddle {
    public static void main(String[] args) {
        String s = "elephant";
        char target = 't';
        System.out.println("search(s, 0, s.length(), target) = " + search(s, 0, s.length(), target));
    }

    private static int search(String s, int begin, int end, char target) {
        if (begin > end) {
            return -1;
        }

        int middle = (begin + end) / 2;
        if (s.charAt(middle) == target) {
            return middle;
        }

        int index = search(s, begin, middle-1, target);
        if (index != -1) {
            return index;
        }

        return search(s, middle + 1, end, target);
    }

    /**
     * search(s, 0, s.length(), target) = 7
     * */
}
