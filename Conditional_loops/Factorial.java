import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        scn.close();
        System.out.println(getFact(n));

    }

    public static int getFact(int n ){

        int fact=1 ;

        while(n>1){
            fact*=n ;
            n--;
        }

        return fact;

    }
}
