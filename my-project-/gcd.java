import java.util.Scanner ;
public class gcd {
    public static void main (String[] args ){
Scanner sc = new Scanner (System .in);
System .out .println("enter 1 st number ");
int a = sc .nextInt();
Scanner sb = new Scanner ( System .in);
System .out .println("enter 2nd  number ");
int b = sb .nextInt();
     Scanner sa = new Scanner ( System .in);   
     System .out .println("enter 3rd  number ");
     int c = sa.nextInt();
     if ( a > b && a > c ){
        System.out.println( " the number a is largest number among three number "+ a);
     }
    else if ( b > a && b > c ){
        System.out.println( "the number  b is largest number among  three numbers " + b );
     }
      else if ( c >a && c > b ){
        System.out.println ("the number c is the largest number among  all three numbers " + c);
     }
    }
}