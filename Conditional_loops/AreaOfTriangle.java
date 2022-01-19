import java.util.Scanner;



public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        float h = scn.nextFloat() ;
        float b = scn.nextFloat();
          scn.close(); 

        float area = h*b / 2 ;

        System.out.println(area );
    }
    
}
