import java.util.Scanner ;

public class alpha2{
    public static void main(String[] args ){
        Scanner sx = new Scanner (System.in);
        System.out.print( " enter the number ");
        int n = sx.nextInt();
        int k = 65 ;
        for ( int  i = 1 ; i<=n; i++){
            for ( int  j = 1 ;j<=n;j++){
        System.out.print((char)k + " ");
            }
            System.out.println(" ");
            k++;
        
        }
        int k2 = 97;
        for ( int i=1;i<=n;i++){
            for( int j=1;j<=n;j++){
                System.out.print((char)k2 + " ");
            }
            System.out.println( " ");
            k2++;
        }

    }
}