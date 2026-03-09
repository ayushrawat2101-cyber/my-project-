import java.util.Scanner ;
public class com {
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print( " enter the number ");
        int n = sc.nextInt();
        int k1 = 66 ; 
        int k2 = 97;
        for ( int i =1; i<=n ;i++){ // determines the no of rows 
            for ( int j =1;j<=n;j++){// print the first kine small cases 
                System.out.print(( char )k2 + " ");
            }
            System.out.println(" ");
        k2+=2;
        for( int x =1;x<=n;x++){// prints the second line in large cases
            System.out.print((char)k1 + " ");
        }
        System.out.println(" ");
        k1+=2;
        }
        
        

    }
}