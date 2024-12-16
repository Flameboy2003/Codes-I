package Paiyalagam;

public class O12_SquareRoot {
    public static void main(String[] args) {

        int no = 36;
        int i = 2;
        while (i <= no / 2) {
            if (no / i == i) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
