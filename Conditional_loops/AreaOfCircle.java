import java.util.Scanner ;

class AreaOfCircle{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double radius= scn.nextDouble() ;
            scn.close();

        double area =  (Math.PI* radius * radius) ;

        System.out.println(area);

        
    }
}