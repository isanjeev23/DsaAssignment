import java.util.Scanner;



public class excangeRate {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
           int inr = scn.nextInt();
              
            scn.close();

           float exRate = 0.013f;

           float usd = inr * exRate;

           System.out.println(inr + "indian rupees is equal to " + usd);
    }
    
}
