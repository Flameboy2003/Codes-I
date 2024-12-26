package Paiyalagam;

public class O21_FactorialOfFactorial {
    public static void main(String[] args) {

        /*
        int num = 5;
        int i = num;

        while (i > 1) {
            int fact = 1;
            while (num > 1) {
                fact = fact * num;
                num--;
            }
            System.out.println(fact);
            i--;
            num = i;
        }
        */

        int num = 5;
        while (num > 0) {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i; // Compute factorial of `num`
            }
            System.out.println("Factorial of " + num + " is: " + fact);
            num--; // Decrement `num` for the next iteration
        }
    }
}