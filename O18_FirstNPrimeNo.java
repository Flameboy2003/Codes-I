package Paiyalagam;

public class O18_FirstNPrimeNo {
    public static void main(String[] args) {

        System.out.print(2 + " "); // Print 2, the first prime number

        int no = 3;
        int i = 2;
        int count = 1; // Count starts at 1 because 2 is already printed
        boolean prime = true;

        while (count < 50) {
            while (i < no) {
                if (no % i == 0) {
                    System.out.println("Not a prime");
                    prime = false;
                }
                i++;
            }
            no = no + 2;
            if (prime == true) {
                System.out.print(no + " ");
                count++;
            }
        }
    }
}
