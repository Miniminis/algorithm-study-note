package practice.algorithm.recursion;

public class SearchFromBegin {
    public static void main(String[] args) {
        String s = "elephant";
        char target = 'p';
        System.out.println("search(s, 0, s.length(), target) = " + search(s, 0, s.length()-1, target));;
    }

    private static int search(String s, int begin, int end, char target) {
        if (begin >= end) {
            return -1;
        }

        if (s.charAt(begin) == target) {
            return begin;
        }

        return search(s, begin+1, end, target);
    }

    /**
     * search(s, 0, s.length(), target) = 3
     * */
}
