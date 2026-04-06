import java.util.*;
public class mult {
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print("enter the number u wants to print table ");
        int num = sc.nextInt();
        for ( int i = 1 ; i<=10 ;i++){
            System.out.println(num + "*"+ i +"="+ num * i );
        }
    }
}
