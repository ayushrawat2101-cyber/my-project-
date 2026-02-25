import java.util.Scanner ;
public class series {
    public static void main ( String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print("enter the no of terms you want to print ");
        int n = sc.nextInt();
        int a = 99 , d = 4 ;
        for ( int i = 1 ; i <=n ;i++){
            if ( a > 0 ){
            System.out.print(a+ " ");
            }
            a -=d;
        }

    }
}