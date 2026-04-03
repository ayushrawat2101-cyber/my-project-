import java.util.*;
public class simplecalc{
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print("enter the value of an a ");
        int a = sc.nextInt();
        System.out.print("enter the value of an b ");
        int b = sc.nextInt();
        System.out.print("enter the operation ");
        String operator = sc.next();
        int result = switch(operator){
            case "+"-> (a+b) ;
            case "-" -> (a - b) ;
            case "*" -> (a * b) ;
            case "/" -> (a /b) ;
            default -> -1 ;
        };
        System.out.print(result);
   }
}