import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
         int a  = scn.nextInt();
         int b = scn.nextInt();

         char oprand = scn.next().charAt(0);
                       scn.close();
                       
         if(oprand == '+'){
             System.out.println(a+b);
         }
         else if(oprand =='*'){
             System.out.println(a*b);

         }
         else if(oprand =='-'){
             System.out.println(a-b);
         }else if(oprand == '/'){
             System.out.println(a/b);
         }else if(oprand =='%'){
             System.out.println(a%b);
         }
         else {
             System.out.println("input wrong oprand");
         }
    }
    
}
