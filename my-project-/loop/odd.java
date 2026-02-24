import java .util.Scanner ;
public class odd {
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print( " enter the number ");
        int n = sc .nextInt();
        for ( int i = 0 ; i<=n ;i++){
            if ( i % 3==0){
                System.out.print( i + " ");
            }
        }
    }
}