package Paiyalagam;

public class O38_DuplicatesAndUniqueFreqCount {
    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 10, 20, 30, 40, 50, 10};

        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                    freq[j] = -1;
                }
                if (freq[i] != -1) {
                    freq[i] = count;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : freq) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int j = 0; j < freq.length; j++) {
            if (freq[j] == 1) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
