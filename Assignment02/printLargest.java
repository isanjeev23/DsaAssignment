import java.util.Scanner;

public class printLargest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();
             scn.close();

            if(n1>n2){
                System.out.println(n1 + " n1 is max");

            }else
              System.out.println(n2 + " n2  is max ");

    }
}
