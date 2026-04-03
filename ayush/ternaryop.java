import java.util.*;
public class ternaryop{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in );
        System.out.println("welcome to the number checker ");
        System.out.println("please enter your first number ");
        int num1 = sc.nextInt();
        System.out.println("please enter the second number ");
        int num2 = sc.nextInt();
       /* if(num1>num2){
            System.out.print(num1 +" is the gretaest number  ");
        }
        else {
            System.out.print(num2+"is the greatest number ");
        }*/
       int greatest = num1 > num2 ? num1:num2;
       System.out.print(greatest+"is the greatsest number ");

}
}