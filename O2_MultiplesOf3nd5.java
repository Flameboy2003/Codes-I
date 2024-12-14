package Paiyalagam;

public class O2_MultiplesOf3nd5 {
    public static void main(String[] args) {

        int no = 1;
        while (no <= 20) {

            if ((no % 3 == 0) && (no % 5 == 0)) {
                System.out.println(no);
            }
            no++;
        }
    }
}
