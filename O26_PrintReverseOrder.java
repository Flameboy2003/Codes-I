package Paiyalagam;

public class O26_PrintReverseOrder {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int len = arr.length - 1;
        for (int i = len; i >= 0; i--) {
            System.out.print(" "+ arr[i]);
        }
    /*
        while(len >=0){
            System.out.print(" " +arr[len]);
        len--;
        }
    */
    }
}
