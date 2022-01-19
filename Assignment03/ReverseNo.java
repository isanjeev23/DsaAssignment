import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
                scn.close(); 

        int rev = 0 ;

        while(n > 0 ){
            int rem = n % 10 ;
               n = n / 10 ;

               rev = rev * 10 + rem ;
        }

        System.out.println(rev);
    }
    
}
