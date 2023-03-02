package practice.algorithm.bit;

public class ClearBit {

    static int clearBit(int num, int idx) {
        return num & ~(1 << idx);
    }

    public static void main(String[] args) {
        //1 0 0 1 -> 0 0 0 1 = 1
        System.out.println(clearBit(9, 3));
        // 0 1 0 1 -> 0 1 0 1 = 5
        System.out.println(clearBit(5, 3));
    }
}
