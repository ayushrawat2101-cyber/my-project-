import java.util.Scanner ;
public class gp {
    public static void main ( String[] args ){
Scanner sc = new Scanner ( System.in );
System.out.print("enter the first terems of gp ");
int a = sc.nextInt();
Scanner sb = new Scanner (System.in);
System.out.print( " enter the no terms you want to print ");
int n = sb.nextInt();
Scanner sa = new Scanner ( System.in);
System.out.print(" enter the commmon ratio b ");
int b = sa.nextInt();
for ( int i =1 ;i<=n;i++){
System.out.print(a+ " ");
 a *=b;
}

    }
}