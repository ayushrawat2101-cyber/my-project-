import java.util.Scanner ;
public class nested {
    public static void main(String[] args){
     Scanner sc = new Scanner ( System .in );
System.out.println(" enter the 1 st number ");
int a = sc.nextInt();
Scanner sb = new Scanner ( System .in );
System.out.println(" enter the  2 nd  number ");
int b = sb.nextInt();
Scanner sm = new Scanner ( System .in );
System.out.println(" enter the 3 rd  st number ");
int c = sm.nextInt();
// if ( a > b && a > c ){
//     System.out.println(" a is the largest number "+ a );
// }
// else {

// if ( b > a && b>c ){
//     System.out.println( " b is the largest number "+ b );
// }
// else {
//     System.out.println(" c is the largest number "+ c );
// }
// }


// without using multiple condition 

if ( a > b ){//b is not max number 
    if ( a >c ){
        System.out.println(" a is the largest number "+ a );
    }
    else {
        System.out.println( " c is the largest number "+ c );
    }
}
else {
    if ( b > c  )// a is not max
     {
        System.out.println( " b is the largest number "+b);
    }
    else {
        System.out.println( " c is the largest element "+c );
    }

}
    }
}