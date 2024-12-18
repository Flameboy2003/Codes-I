package Paiyalagam;

public class O15_Palindrome {


    public static void main(String[] args) {
        int num = 123;

        int rem = 0;
        int temp = num;

        while (num > 0) {

            rem = (rem * 10) + num % 10;
            num = num / 10;
        }

        if (rem == temp) {
            System.out.println(temp + " is Palindrome");
        } else {
            System.out.println(temp + " is Not a Palindrome");
        }
    }
}
