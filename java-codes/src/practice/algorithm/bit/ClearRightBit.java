package practice.algorithm.bit;

public class ClearRightBit {

    static int clearRightBits(int num, int idx)  {
        return num & (-1 << (idx+1));
    }

    public static void main(String[] args) {
        //1
        System.out.println(clearRightBits(169, 3));
    }
}
