import java.util.Scanner ;
public class fact {
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.println("welcome to factorail generator ");
        System.out.println("enter your number to print ");
        int num = sc . nextInt();
        // long FACT = a(num);
        // System.out.println("your factorial is : "+ FACT );
        long FCATR = b(num);
        System.out.print( " you factorail of a number is : " +FCATR);
    }
    public static long b(int num ){
        System.out.println("function called for : "+num );
        if (num ==1 ){
            return 1 ;
        }
        return num * b (num-1);
    }
//     public static long a (int num ){
// long result = 1 ;
//         for ( int i = 1 ;i<= num ;i++){
// result = result * i ;
//         }
//         return result ;
//     }
}
