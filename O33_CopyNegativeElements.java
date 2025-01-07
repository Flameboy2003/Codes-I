package Paiyalagam;

public class O33_CopyNegativeElements {
    public static void main(String[] args) {


        int[] arr = {1, -2, 3, -4, 5, -6};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }

        int[] res = new int[count];
        int idx = 0;

        for (int num : arr) {
            if (num < 0) {
                res[idx++] = num;
            }
        }

        for (int e : res) {
            System.out.print(" " + e);
        }
    }
}
