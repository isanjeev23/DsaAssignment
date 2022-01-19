import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int principalAmt = scn.nextInt();
        float rate = scn.nextFloat();
        int time = scn.nextInt();

             scn.close();

        float intrest = principalAmt * rate * time / 100 ;
        System.out.println(intrest);
    }
    
}
