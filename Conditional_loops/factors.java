import java.util.Scanner;


public class factors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1 ;
        while(i<=n){
            if(n%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
