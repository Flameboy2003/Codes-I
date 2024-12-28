package Paiyalagam;

public class O24_StrongNumber {
    public static void main(String[] args) {
        int num = 145;  // Input number
        int original = num;  // Store the original number for comparison
        int res = 0;  // To store the sum of factorials of digits

        while (num != 0) {
            int rem = num % 10;  // Extract the last digit

            // Calculate the factorial of the digit
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }

            // Add the factorial to the result
            res += fact;

            // Remove the last digit
            num /= 10;
        }

        // Check if the number is a Strong Number
        if (res == original) {
            System.out.println(original + " is a Strong Number.");
        } else {
            System.out.println(original + " is not a Strong Number.");
        }
    }
}
