package Paiyalagam;

public class O1_SumOfSeries {
    public static void main(String[] args) {
        int no = 1;
        int sum = 0;

        while (no <= 5) {
            sum = no + sum;
            no++;
        }
        System.out.println(sum);
    }
}
