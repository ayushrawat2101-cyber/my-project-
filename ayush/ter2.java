import java.util.*;
public class ter2 {
    
    void show() {
                Scanner sc = new Scanner ( System.in );
        System.out.print("enter the number n ");
        int n = sc.nextInt();
String  check = (( n%2 == 0) ? "even ":"odd");
System.out.print(n+"is an "+check);
    }
    public static void main(String[] args ){

        ter2 e1 = new ter2();
        e1.show();
    }
   
}