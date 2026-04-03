import java.util.*;
public class abs {
    void car(){
        Scanner sc = new Scanner ( System.in );
        System.out.print("enter the value of n ");
        int n = sc.nextInt();
        int b = ((n<0)? n*(-1):n);
        System.out.print("the absolute value of " + n +"is :"+ b);
    }
    public static void main(String[] args ){
abs a1 = new abs();
a1.car();
    }
}
