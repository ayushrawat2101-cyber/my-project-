import java.util.Scanner;
public class bigsmall{
    public static void main ( String[] args ){
        Scanner sc  = new Scanner ( System.in);
        System.out.print(" enter the no of rows ");
        int n = sc.nextInt();
        int k = 97;
        int k2 = 66;
                       for ( int i = 1 ;i<=n-2;i++){
            for ( int j = 1;j<=n;j++){
System.out.print((char)k+" ");
            }
            System.out.println(" ");
            k+=2;
            for ( int k3 = 1 ;k3<=n;k3++){
                System.out.print( ( char)k2+" ");
            }
            System.out.println(" ");
            k2+=2;
        }

    }
}