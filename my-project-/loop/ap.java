import java.util.Scanner ;
public class ap{
    public static void main(String[] args ){
        // Scanner sc = new Scanner ( System.in );
        // System.out.println("enter the no of terms upto you want to print ");
        // int n = sc.nextInt();
        // for ( int i =2 ;i<= 3*n-1 ;i+=3){
        //     System.out.print(i+ " ");
        Scanner  sc = new Scanner (System.in);
        System.out.print("enter the first term a ");
        int a = sc.nextInt();
        Scanner sa = new Scanner ( System.in );
        System.out.print(" enter the common difference d ");
        int d = sa.nextInt();
        Scanner sb = new Scanner (System.in );
        System.out.print( "enter the no terms upto you wnt to print ");
        int n = sb.nextInt();
        for ( int i = 1 ;i<=n;i++){
            System.out.print(a+ " ");
            a += d;
        }
        }
    }
