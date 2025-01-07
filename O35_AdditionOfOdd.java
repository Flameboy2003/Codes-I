package Paiyalagam;

public class O35_AdditionOfOdd {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int total = 0;

        for (int i = 1; i < arr.length; i += 2) {
            total += arr[i];
        }
        System.out.println(total);

    }
}
