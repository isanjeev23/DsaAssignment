import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        

        while(true){
            int ans = 0 ;

            System.out.print("Enter the operator : ");
            char op = scn.next().trim().charAt(0) ;
        

            if(op=='+' || op =='-' || op=='/' || op=='*' || op == '%' ){

                System.out.print("Enter two num : ");
                int num1 = scn.nextInt();
                int num2 = scn.nextInt();

                if(op=='+'){
                    ans = num1 + num2;
                
                }
                else if(op=='-'){
                    ans = num1 - num2 ;
                }
                else if(op=='*'){
                    ans = num1 * num2 ;
                }
                else if(op=='%'){
                    ans= num1 % num2 ;
                }
                else {
                    if(num2 !=0){
                        ans = num1 % num2;
                    }
                }

                
            }
            else if(op=='x' || op == 'X'){
                break ;
            }
            else {
                System.out.println("Invaild oprator ");
            }

            System.out.println(ans) ;
        }

        scn.close(); 
    }
}
