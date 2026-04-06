import java.util.*;
import java.util.Scanner ;
public class DOWHILE{
    public static void main(String[] args ){
//         Scanner sc =  new Scanner(System.in);
// System.out.print("enter your age ");
// int age = sc.nextInt();
// while(age < 0 || age >100){
//     System.out.print("enter your age ");
//     age = sc.nextInt();
//     }
//     System.out.print("your age is : "+ age );
int age ; 
do{
Scanner sc = new Scanner ( System.in );
System.out.print("please enter your age ");
 age = sc.nextInt();
}while ( age < 0 || age >100);
    System.out.print("your age is : "+ age );
}
}
