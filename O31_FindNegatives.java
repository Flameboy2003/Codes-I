package Paiyalagam;

public class O31_FindNegatives {
    public static void main(String[] args) {

        int arr[] = {-1, 2, 3, -4, 5, -6};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
