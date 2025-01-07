package Paiyalagam;

public class O32_CopyArrayIntoReverse {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

        int[] resArr = new int[arr.length];

        int idx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            resArr[idx++] = arr[i];
        }

        for (int num : resArr) {
            System.out.print(" " + num);
        }
    }
}
