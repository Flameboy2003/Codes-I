package Paiyalagam;

public class O8_CountOfInteger {
    public static void main(String[] args) {

        int no = 55667;
        int count = 0;

        while (no > 0) {
            count++;
            no = no / 10;
        }
        System.out.print(count);
    }
}
