package practice.algorithm.bitmasking;

/*
* 서로 다르면 1, 같다면 0
* */
public class XOR {
    public static void main(String[] args) {
        int a = 3;      //011
        int b = 5;      //101

        System.out.println(a ^ b);  //110 = 6
    }
}

/*
* 111
* 101
* ---
* 010
*
* 101
* 100
* ---
* 001
*
* 001
* 100
* ---
* 101
* */
