package practice.algorithm.bitmasking;

/**
 * 집합의 크기 구하기
 * */
public class SetSize {
    public static void main(String[] args) {
        System.out.println(bitCount(15));
    }

    private static int bitCount(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 2 + bitCount(num / 2);
    }
}
