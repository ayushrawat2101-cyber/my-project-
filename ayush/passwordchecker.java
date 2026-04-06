import java.util.*;
public class passwordchecker {
    public static void main(String[] args ){
        int n ;
        do{
            Scanner sc = new Scanner ( System.in );
            System.out.print("enter the password ");
             n = sc.nextInt();
        }while(n!=1234);
        System.out.print("your password is : "+n ) ;
    }
}
