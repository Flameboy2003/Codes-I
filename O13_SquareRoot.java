package Paiyalagam;

public class O13_SquareRoot {
    public static void main(String[] args) {

        int n =49;
        int i = 2;
        while(i < n/2){
            if( n /i == i){
                System.out.println(i);
            }
            i++;
        }
    }
}
