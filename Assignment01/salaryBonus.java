import java.util.*;

public class salaryBonus{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int salary = scn.nextInt();
                scn.close();

        if(salary > 10000){
            salary = salary + 2000 ;
        }
        else{
            salary = salary + 1000 ;
        }

        System.out.println(salary);

    }
}