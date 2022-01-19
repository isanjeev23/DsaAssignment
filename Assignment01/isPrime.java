import java.util.*;

class isPrime{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num  = scn.nextInt();
            scn.close();

            if(num==1){
                System.out.println("neither prime nor composite");
                return ;
            }

        int div = 2 ; 
         

        while(div * div <= num){

            if(num % div == 0 ){
                System.out.println("not prime");
                 return; 
            }

            div++ ;
        }

        System.out.println("prime");
    }
}