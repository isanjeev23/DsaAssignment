import java.util.*;
 class gcd {
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
         int n1 = scn.nextInt();
         int n2 = scn.nextInt();
            scn.close();

       
            int temp1= n1 ;
            int temp2 = n2 ;


            while(n1% n2 !=0){
                int rem = n1 % n2 ;
                // new devidend will be divisior
                n1=n2;
                //new divisior will be rem acc to ecqlid method
                n2 = rem;
            }

            int gcd = n2 ;

            System.out.println(gcd);

            int lcm = (temp1 * temp2 )/gcd;

            System.out.println(lcm);


    }
    
}
