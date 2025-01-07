package Paiyalagam;

public class O37_Smallest {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        int Smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < Smallest) {
                Smallest = arr[i];
            }
        }
        System.out.println(Smallest);
    }
}
