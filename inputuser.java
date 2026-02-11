import java.util.Scanner;

public class inputuser {
    public static void main(String[] args) {
        // Scanner sc = new  Scanner (System.in);
        // System.out.print("enter the radius of circle :");
        // double radius = sc.nextDouble();
        // double pi = 3.1415 ;
        // double area = pi * radius  * radius  ;
        // System.out.print("area of circle is ");
        // System.out.println(area);


        // print square of a number 
        // Scanner sc = new Scanner (System.in);
        // System . out . print("enter the number you want to  square it ");
        // int x = sc .nextInt() ;
        // int square = x * x ;
        // System.out.print("the square of number is :");
        // System.out.print(square);

        // print the sum of numbers 
        // Scanner ac = new Scanner (System.in );
        // System.out . println(" enter the value of three numbers");
        // System.out.print("enter the value of x ");
        // int x = ac.nextInt();
        // Scanner bc = new Scanner (System.in);
        // System.out.print("enter the value of y ");
        // int y = bc.nextInt();
        // Scanner Cc = new Scanner (System.in);
        // System.out.println("enter the value of z ");
        // int z = Cc.nextInt();
        // int add = x + y + z ;
        // System .out . print(add );
        Scanner sc = new Scanner(System.in );
         System.out .print("enter the value of principle ");
        double p = sc.nextDouble();
         System.out .print("enter the value of rate ");
        double r = sc.nextDouble();
         System.out .print("enter the value of time ");
        double t = sc.nextDouble();
        System.out.println(" the simple interest is :");
        double si = p*r*t /100 ;
        System.out .print(si);

}
}