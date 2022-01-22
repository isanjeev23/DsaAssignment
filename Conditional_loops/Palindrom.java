import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      
        // enter a no 
        int n = scn.nextInt();
        int temp =n ;
        
        int revNo = 0 ;

        while(n>0){
            int r = n % 10 ;
            n/=10;

            revNo =revNo*10 + r ;
        }

        if(temp==revNo){
            System.out.println("palindrome no");
        }else{
            System.out.println("not a palindrome");
        }
        
    }
    
}
