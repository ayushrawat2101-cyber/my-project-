import java.util.Scanner;
public class power {
    public static void main( String[] args ){
Scanner sc = new Scanner ( System .in );
System.out.println(" enter the value of  a ");
int a = sc.nextInt();

Scanner sb = new Scanner ( System .in );
System.out.println(" enter the value of  b ");
int b = sb.nextInt();
int power = 1 ;
for( int i = 1 ; i<=b;i++){
    power = power * 2 ;

}
System.out.println( a + " raise to power "+ b  +"is "  + " " +power);


    }
}