import java.util.Scanner;

class Nthfibbo{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
                scn.close();

         int a = 0 ;
         int b = 1 ;
         /* Oth element is 1 1st element is 1  after that every elment is the sum of previous 
            two element .
            because 1st element is 1  so if we have to claculate nth term loop will run n-1 times
            */
         
          while(n-->1){
              int temp = b ;
              b = b + a ;
              a = temp ;
          }

          System.out.println(b);
    }
}