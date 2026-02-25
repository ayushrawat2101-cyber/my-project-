import java.util.Scanner;
import java.math.*;
public class sqrt {
    public static void main (String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print( "enter the number ");
        int n = sc.nextInt();
        double  y = Math.sqrt(n);
        double z = Math.cbrt(n);
        System.out.println(y);
        System.out.print(z);
        System.out.print("  ");
        for (int i = 1 ; i<=Math.sqrt(n) ; i++){
            if (n%i==0){
                System.out.println(i);
                System.out.println(n/i);
            }
        }

    }
}