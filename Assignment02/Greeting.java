import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

         String name = scn.nextLine();
                       scn.close();
         
         display(name);
    }

    public static void display(String name){
        System.out.println("Good Mornig Mr. " + name);
    }
    
}
