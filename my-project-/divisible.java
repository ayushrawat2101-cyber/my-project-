import java.util.Scanner ;
public class divisible {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int x = sc.nextInt();
        if ( x%5==0){
            System.out.println("the number is divisible by 5 ");
        }
         if ( x % 3==0){
            System.out.println("the number is divisible by 3 ");

        }
        if ( x % 5 ==0 && x%3 ==0){
            System.out.println("the number is divisible by both the numbers 5 and 3 ");
        }
         if (x %5 ==0 || x%3 ==0){
            System.out.println("the number is divisible by 5 or 3 ");
        }
    
        else {
            System.out.println(" the number is not divisible by 5 and 3 ");
        }

    }
}