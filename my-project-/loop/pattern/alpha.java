import java .util.Scanner ;
public class alpha{
    public static void main( String[] args ){
        Scanner sc = new Scanner   ( System.in );
        System.out.println(" enter the number ");
        int n = sc.nextInt();

        for( int i=1 ;i<=n;i++){
            for( int j = 65  ;j<65+n;j++){
                System.out.print( (char)j+ " ");
               }
               System.out.println( " ");
        }
        for ( int i = 1 ; i<=n;i++){
        for ( int k = 97 ;k<97+n;k++){
System.out.print((char)k + " ");
        }
        System.out.println(" ");
    }
}
}