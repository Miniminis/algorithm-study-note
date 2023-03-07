package practice.algorithm.bitmasking;

/**
 * 두 수가 모두 1일때만 1, 나머지는 0
 * */
public class AND {
    public static void main(String[] args) {
        int a = 4;  //100
        int b = 7;  //111

        System.out.println(a & b);  //100
    }
}

/*
 * 1111
 * 1010
 * ----
 * 1010
 * */

/*
 * 1000
 * 1001
 * ----
 * 1000
 * */

/*
 * 1100
 * 0011
 * ----
 * 0000
 * */
