import java .util.Scanner ;
public class reak {
    public static void main ( String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print( " enter the number  ");
        int n = sc.nextInt();
        boolean flag = true ;// it means number is prime 
        for( int i = 2 ;i<=n-1 ;i++){
if ( n %i ==0 ){
    flag =false ;// no is an composite if it satisfies the conditionn 

}
        }
        if ( n ==1 ){
            System.out.print( " the number is neither prime nor composite ");
        }
         else if ( flag == true ) {
            System.out.print( " the no is still prime ");
        }
        else {
            System.out.print( " the number is composite ");
        }
    }
}