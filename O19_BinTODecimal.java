package Paiyalagam;

public class O19_BinTODecimal {
    public static void main(String[] args) {
        int bin = 1111;

        int i = 0;

        int rem = 0;
        int decimal = 0;
        while (bin > 0) {
            rem = bin % 10;
            decimal += (int) (rem * Math.pow(2, i));
            bin /= 10;
            i++;
        }
        System.out.println(decimal);

    }
}
