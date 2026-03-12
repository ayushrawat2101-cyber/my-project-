import java.util.Scanner ;
public class reversestar{
    public static void main(String[]  args ){
        Scanner sc = new Scanner (System.in );
        System.out.print("enter the number of rows ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ;i++){
            for( int k=2;k<=i;k++){
System.out.print(" ");
            }
            for(int j =1;j<=n+1-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}