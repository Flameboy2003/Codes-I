package Paiyalagam;

// 1 2 4 7 11 16
public class O5_Sequence {
    public static void main(String[] args) {

        int i = 1;
        int j = 0;

        while (i <= 16) {
            System.out.print(" " + i);
            i = i + j;
            i++;
            j++;
        }

    }
}
