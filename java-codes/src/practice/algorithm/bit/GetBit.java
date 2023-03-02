package practice.algorithm.bit;

public class GetBit {

    static boolean getBit(int num, int idx) {
        return (num & (1 << idx)) != 0;
    }

    public static void main(String[] args) {
        //1 0 0 1
        System.out.println(getBit(9, 3));
        // 0 1 0 1
        System.out.println(getBit(5, 3));
    }
}
