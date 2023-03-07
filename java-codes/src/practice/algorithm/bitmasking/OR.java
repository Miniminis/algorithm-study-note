package practice.algorithm.bitmasking;

/**
* 둘 중 하나라도 1이면 1, 나머지는 0
* */
public class OR {
    public static void main(String[] args) {
        int a = 2;  //010
        int b = 5; //101

        System.out.println(a | b);  //111 = 7
    }
}

/*
* 111
* 001
* ---
* 111
* */

/*
* 101
* 001
* ---
* 101
* */

/*
* 001
* 100
* ---
* 101
* */
