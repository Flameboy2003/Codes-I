package Paiyalagam;

public class O25_neonNumber {
    public static void main(String[] args) {
        int x = 9;  // Input number

        int y = x * x;  // Square of the number

        int rem = 0;
        int res = 0;

        // Calculate the sum of the digits of the square
        while (y != 0) {
            rem = y % 10;
            res += rem;
            y = y / 10;
        }

        // Check if the sum equals the original number
        if (res == x) {
            System.out.println(x + " is a Neon Number.");
        } else {
            System.out.println(x + " is not a Neon Number.");
        }
    }
}
