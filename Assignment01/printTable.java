import java.util.*;
public class printTable {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
          int num = scn.nextInt();

          scn.close();

          int i = 1 ;

          while(i<=10){
              System.out.println(num * i);
              i++;
          }

          
    }
}
