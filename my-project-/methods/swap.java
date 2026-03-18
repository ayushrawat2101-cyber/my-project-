import java.util.Scanner ;
public class swap {
    public static void Swap(int a ,int b){
        int c = a ;
         a = b ;
         b =c ;
         System.out.println(  " a  is =" + a);
         System.out.println("b is ="+ b);
        
    }
public static void main (String[] args ){
Scanner sc = new Scanner ( System.in );
System.out.print("ENTER THE NUMBER A " );
int a = sc.nextInt();
Scanner sx = new Scanner ( System.in );
System.out.print("ENTER THE NUMBER B ");
int b = sc.nextInt();
Swap( a,b );
}
}