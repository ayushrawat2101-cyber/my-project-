import java.util.Scanner ;
public class least {
    public static void main (String[]  args ){
Scanner sc = new Scanner ( System.in );
System .out .println( " enter the 1st number ");
int a = sc . nextInt() ; 

Scanner sb = new Scanner ( System.in );
System .out .println( " enter the 2nd  number ");
int b = sb . nextInt() ; 

Scanner sm = new Scanner ( System.in );
System .out .println( " enter the 3rd  number ");
int c = sm . nextInt() ; 
//  if ( a <b && a< c ){
// System.out.println( " a is the smallest  number "+ a );
//  }
//  else {
//     if (  b < a && b < c ){
//         System.out.println( " b is the smallest number "+ b);
//     }
//     else {
//         System.out.println( " c is the smallest number "+ c );
//     }
//  }
if ( a < b ){// b is not smallest 
    if ( a < c ){
        System.out.println( "a is the samllest number  "+a );
    }
    else {
        System.out.println(" c is the smallest number "+ c );
    }

}
else {
    if ( b < c ){
        System.out.println( " b is  the samllest  number "+b);

    }
    else {
        System.out.println ( " c is the smallest number "+ c );
    }
}
    }
}