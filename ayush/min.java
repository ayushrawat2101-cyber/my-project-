import java.util.Scanner ;
import java .util.*;
public class min {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in );
        System.out.println("enter the value of x ");
        int x = sc.nextInt();
Scanner sb = new Scanner ( System.in );
System.out.print("ENter the value of second num ");
int y = sb.nextInt();
 int min = x<y? x:y;
 System.out.print(min+"is a smalllest number ");

    }
}