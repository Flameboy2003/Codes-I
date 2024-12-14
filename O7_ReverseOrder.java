package Paiyalagam;

public class O7_ReverseOrder {
    public static void main(String[] args) {
        int no = 1234;

        int rem = 0;
        int rev = 0;

        while (no > 0) {
            rem = no % 10;
            System.out.print(" " + rem);
            no = no / 10;
        }
    }
}
