import java.util.Scanner ;
public class alphatri{
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print( " enter the no of rows ");
        int n = sc.nextInt();
        for( int i = 65 ;i<n+65 ;i++){
            for ( int j = 65 ; j<=i ;j++){
System.out.print((char )j + " ");
            }
            System.out.println(" ");
        }
    }
}