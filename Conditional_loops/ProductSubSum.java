import java.util.Scanner;

public class ProductSubSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int sum = 0 ;
        int product= 1;

        while(n !=0 ){
            int rem = n % 10 ;
                n = n / 10 ;

             sum +=rem ;

            
             product *=rem;

        }

        int result = product - sum ;

        System.out.println(result);
    }
    
}
