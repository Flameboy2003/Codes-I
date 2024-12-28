package Paiyalagam;

public class O23_ArmstrongNumber {
    public static void main(String[] args) {

        int num = 153;  // Input number
        int temp = num;  // Store the original number for comparison
        int res = 0, rem = 0;

        int count = 0;

        // Calculate the number of digits
        while (num != 0) {
            count++;
            num = num / 10;
        }

        num = temp;  // Reset num to the original value

        // Calculate the sum of each digit raised to the power of the number of digits
        while (num != 0) {
            rem = num % 10;
            res += Math.pow(rem, count);
            num = num / 10;
        }

        // Compare the result with the original number
        if (temp == res) {
            System.out.println("The Given Number is an Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
/* package Paiyalagam;

public class O23_ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;  // Input number
        int originalNum = num;
        int ans = 0;
        int digits = String.valueOf(num).length();  // Calculate the number of digits

        while (num != 0) {
            int rem = num % 10;  // Extract the last digit
            ans += Math.pow(rem, digits);  // Add the digit raised to the power of the number of digits
            num /= 10;  // Remove the last digit
        }

        if (ans == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}

*/