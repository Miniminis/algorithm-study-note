package practice.algorithm.recursion;

public class SearchFromEnd {
    public static void main(String[] args) {
        String s = "elephant";
        char target = 'p';
        System.out.println("search(s, 0, s.length(), target) = " + search(s, 0, s.length()-1, target));
    }

    private static int search(String s, int begin, int end, char target) {
        if (begin >= end) {
            return -1;
        }

        if (s.charAt(end) == target) {
            return end;
        }

        return search(s, begin, end-1, target);
    }

    /**
     * search(s, 0, s.length(), target) = 3
     * */
}
