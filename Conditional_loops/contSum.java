import java.util.Scanner;

public class contSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int sum  = 0 ;
        int count = 0 ;

        while(true){
            int n = scn.nextInt();
            if(n==0){
                break;
            }
            else{
            sum = sum + n ;
              count++;
        }
            
         
        }
        scn.close();
       
        float avg = (float)sum / count ;
        System.out.println(avg);

    }
    
}
