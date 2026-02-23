import java.util.Scanner ;
public class greatest {
    public static void main ( String[] args){
Scanner sc = new Scanner ( System .in );
System.out .println( " enter the 1st number ");
int a = sc.nextInt();

Scanner sb = new Scanner ( System .in );
System.out .println( " enter the 2nd  number ");
int b = sb.nextInt();

Scanner sa = new Scanner ( System .in );
System.out .println( " enter the 3rd number ");
int c  = sa.nextInt();

System.out.println( ( a > b )?(( a > c )? a : c ):((b > c )? b:c ) );
    }
}