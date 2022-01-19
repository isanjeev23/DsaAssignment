import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        Scanner  scn  = new Scanner(System.in);

        int max = 0 ;

        while(true){

            int n = scn.nextInt();

            if(n>max){
                max = n ;
            }
            else if(n==0){
                break;
            }

        }
        System.out.println(max);
        scn.close();
        
    } 
}
