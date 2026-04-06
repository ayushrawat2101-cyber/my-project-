import java.util.*;
public class pass3 {
    public static void main ( String[] args ){
        int password ;
        do{
            Scanner sc = new Scanner ( System.in );
            System.out.print("please enter your password ");
            password = sc.nextInt();
        }while (password != 1234);
        System.out.print("your password is : "+password );
    }
}
