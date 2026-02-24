import java .util.Scanner ;
public class even {
    public static void main(String[] args ){
        Scanner sc = new Scanner (System.in );
        System.out.println( " enter the number upto you  wants to print the even n umber ");
int n = sc.nextInt() ;
for ( int i = 0 ; i<=n ;i++){
    if ( i % 2 ==0 ){
        System.out.print(i + "  ");
    }
}
    }
}