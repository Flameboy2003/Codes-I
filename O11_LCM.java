package Paiyalagam;

public class O11_LCM {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 8;

        int max = num1 > num2 ? num1 : num2;

        while (true) {
            if ((max % num1 == 0) && (max % num2 == 0)) {
                System.out.println(max);

                break;
            }
            max++;
        }
    }
}
