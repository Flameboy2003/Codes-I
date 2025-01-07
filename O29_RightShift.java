package Paiyalagam;

public class O29_RightShift {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};


        int temp = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;


        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();

        int[] arr1 = {1, 2, 3, 4, 5, 6};

        int temp1 = arr[arr1.length - 1];

        int j = arr1.length - 2;
        while (j >= 0) {
            arr1[j+1] = arr1[j];
            j--;
        }
        arr1[0] = temp1;


        for (int num1 : arr1) {
            System.out.print(" " + num1);
        }
    }
}
