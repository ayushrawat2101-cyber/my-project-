import java .util.Scanner ;
public class ternary {
    public static void main (String[] args ){
        Scanner sc = new Scanner (System.in );
        System.out.println ( " enter  the number ");
        int a = sc.nextInt();
        System.out.println( (  a % 2 ==0 )?  " even number " : " odd number "  ) ;
        int b = ( ( a > 0 )? 100: 0);
        System.out.print( b );
    }
}
