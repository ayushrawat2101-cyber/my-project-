import java.util.Scanner ;
public class reverse {
    public  static void main(String[] args ){
       Scanner sc =   new Scanner ( System.in );
       System.out.println( " enter the number ");
      
       int rev = 0 ;
       int sum ;
 int n = sc.nextInt();
 int a =n ;
       while ( n !=0){
        rev = rev * 10 ;
        rev += n% 10 ;
        n =n/10 ;
       }
       sum = rev + a;
       System.out.println( rev );
       System.out.print(sum);
    }
}