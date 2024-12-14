package Paiyalagam;

public class O6_Prime {
    public static void main(String[] args) {

        boolean prime = true;

        int no = 17;
        int i = 2;

        while (no % i == 0) {

            System.out.println("Not a Prime");
            prime = false;
            i++;
        }

        if(prime == true){
            System.out.println("Prime Number");
        }

    }
}
