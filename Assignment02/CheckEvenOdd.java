import java.util.Scanner;

class CheckEvenOdd{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
                scn.close();

        if(n%2==1){
            System.out.println(n + " is odd no");
        }
        else
           System.out.println(n + " is even no");
    }
}