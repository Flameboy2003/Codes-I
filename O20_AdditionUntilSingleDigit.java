package Paiyalagam;

public class O20_AdditionUntilSingleDigit {

    public static void main(String[] args) {
            int num = 345; // Input number
            int rem, res;

            while (num > 9) { // Loop until the number becomes a single digit
                res = 0; // Reset result for each iteration
                while (num > 0) {
                    rem = num % 10; // Get the last digit
                    res += rem; // Add it to the result
                    num /= 10; // Remove the last digit
                }
                num = res; // Update the number to the new result
            }

            System.out.println("Single digit result: " + num);
        }
    }