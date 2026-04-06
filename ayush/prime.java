import java.util.*;
public class prime {
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print("enter the number ");
        int num = sc.nextInt();
        if ( num == 1 ){
            System.out.print("neither prime nor compo");
        }

        for ( int i = 2 ;i<num;i++){
             if ( num % 2 ==0 ){
                System.out.print("the number is not prime ");
                break;
            }

            else {
                System.out.print("the number is a prime number ");
                break;
            }

        }
    }
}
