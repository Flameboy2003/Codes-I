package Paiyalagam;

public class O28_LeftShift {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

        int temp = arr[0];
        int i = 0;

        while (i < arr.length - 1) {
            arr[i] = arr[i + 1];
            i++;
        }
        arr[i] = temp;

        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();


        int[] arr1 = {1, 2, 3, 4, 5};

        int temp1 = arr1[0];
        int j = 0;

        for (j = 0; j < arr1.length - 1; j++) {
            arr1[j] = arr1[j + 1];
        }

        arr1[j] = temp1;

        for (int num1 : arr1) {
            System.out.print(" " + num1);
        }
    }
}
