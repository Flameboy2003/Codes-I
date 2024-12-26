package Paiyalagam;

public class O22_PerfectNumbers {
    public static void main(String[] args) {

        // sum of Divisors == Given No
        // 28 ->1 2 4 7 14


        int num = 28;
        int perfect = 0;
        int i = 1;

        while (i <= num / 2) {
            if (num % i == 0) {
                perfect += i;
            }
            i++;
        }
        if (num == perfect) {
            System.out.println("The Given Number " + perfect + " is perfect ");
        } else {
            System.out.println("The Given NUmber is Not perfect");
        }
    }
}
