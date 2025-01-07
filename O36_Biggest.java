package Paiyalagam;


public class O36_Biggest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int biggest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }

        System.out.println(biggest);

    }
}
