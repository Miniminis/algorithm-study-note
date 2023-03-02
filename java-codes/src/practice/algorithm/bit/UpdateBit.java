package practice.algorithm.bit;

public class UpdateBit {

    static int updateBit(int num, int idx, boolean val)  {
        return num & ~(1 << idx) | ((val? 1:0) << idx);
    }

    public static void main(String[] args) {
        //1
        System.out.println(updateBit(169, 3, false));
    }
}
