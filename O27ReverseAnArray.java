package Paiyalagam;

public class O27ReverseAnArray {
    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50, 60};

        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] arr1 = {1, 2, 3, 4, 5};  // Example array


        int n = arr1.length;
        // Reverse the array using a for loop
        for (int i = 0; i < n/ 2; i++) {
            // Swap elements at indices i and (arr.length - 1 - i)
            int temp = arr1[i];
            arr1[i] = arr1[n - 1 - i];
            arr1[n - 1 - i] = temp;
        }

        // Print the reversed array
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}


