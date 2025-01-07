package Paiyalagam;

public class O34_OddIdxElements {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int[] res = new int[arr.length / 2];

        int idx = 0;

        for (int i = 1; i < arr.length; i = i + 2) {
            res[idx++] = arr[i];
        }
        for (int num : res) {
            System.out.print(" " + num);
        }
    }
}
