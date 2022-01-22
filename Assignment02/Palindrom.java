import java.util.Scanner;


public class Palindrom{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next().trim();
        scn.close(); 
    

        System.out.println(checkPalindrome(str));
    }

    public static boolean checkPalindrome(String str){

        int i = 0 ;
        int k = str.length() - 1 ;

        while(i<k){
            if(str.charAt(i) != str.charAt(k)){
                return false;
            }
            i++;
            k--;
        }

        return true ;
    }

}