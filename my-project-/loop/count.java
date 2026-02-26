import java.util.*;
public class count {
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in);
        System.out.print("enter the number ");
        int n = sc.nextInt();
      int   count = 0;
      if ( n ==0 ){
        n=4;
      }
      while ( n !=0){
        n = n /10;
        count ++;
      }
      System.out.print( " the digit in anumber is " + count);

        
    }
}