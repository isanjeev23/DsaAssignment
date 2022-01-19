import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        
          int n = scn.nextInt();
            scn.close();
          
           System.out.println(isArmstron(n));

    }

    public static boolean isArmstron(int n ){
        int nod = noOfDigit(n);

        int temp = n ;

        int sum = 0 ;

        while( temp > 0){
            int rem = temp % 10 ;
               temp /=10;

               sum +=(int)Math.pow(rem , nod);
        }

        return  sum==n;
    }

    public static int noOfDigit(int n ){
        int count = 0 ;

        while(n>0){
            n=n/10 ;
            count++;
        }
        return count ;
    }
    
}
