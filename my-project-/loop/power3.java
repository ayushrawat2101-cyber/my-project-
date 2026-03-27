import java.util.Scanner;
public class power3{
    public static void main(String[] args ){
        Scanner sc = new Scanner (System.in );
        System.out.println(" take input a ");
        int a = sc.nextInt();
        Scanner sb = new Scanner ( System.in );
        System.out.println(System.in);
        int b = sb.nextInt();
        int power =1;
for ( int i =1;i<=b;i++){
    power = power * 2 ;
}
System.out.println(power);
double  c = Math.pow(a,b);
System.out.println(c);
}
    }
