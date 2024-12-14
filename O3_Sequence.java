package Paiyalagam;


//Print this Sequence 2 6 12 20 30

public class O3_Sequence {
    public static void main(String[] args) {

        int no = 1;
        while (no <= 5) {
            System.out.print(" "+ no * (no +1));
            no++;
        }
    }
}
