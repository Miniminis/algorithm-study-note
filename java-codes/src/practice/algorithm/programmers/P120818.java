package practice.algorithm.programmers;

/**
 * 옷가게 할인받기
 * */
public class P120818 {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int price) {
            return Discount.getDiscountedPrice(price);
        }
    }

    enum Discount {

        TEN(100000, 0.95),
        THIRTY(300000, 0.90),
        FIFTY(500000, 0.80);

        private int price;

        private double rate;

        Discount(int price, double rate) {
            this.price = price;
            this.rate = rate;
        }

        public static int getDiscountedPrice(int initialPrice) {
            double discountRate = 1.0;

            if (initialPrice >= 500000) {
                discountRate = FIFTY.rate;
            } else if (initialPrice >= 300000) {
                discountRate = THIRTY.rate;
            } else if (initialPrice >= 100000) {
                discountRate = TEN.rate;
            }

            return (int) ((double) initialPrice * discountRate);
        }
    }

    class Solution2 {
        public int solution(int price) {
            int answer = 0;

            if(price>=500000) return (int)(price*0.8);
            if(price>=300000) return (int)(price*0.9);
            if(price>=100000) return (int)(price*0.95);

            return price;
        }
    }


}
