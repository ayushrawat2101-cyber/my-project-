import java .util.Scanner ;
public class maxbuilt{
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.println(" enter the number ");
        int n1 = sc.nextInt();
        Scanner sx = new Scanner ( System.in);
        System.out.println(" enter the 2nd number ");
        int n2 = sx.nextInt();
        Scanner sb = new Scanner ( System.in );
        System.out.println("enter the 3rd number ");
        int n3 = sb.nextInt();
        Scanner sq = new Scanner ( System.in );
System.out.println("enter the 3rd number ");
int n4 = sq.nextInt();
System.out.println(Math.max(Math.max(n1,n2),Math.max(n3,n4)));
// power function 
System.out.println(Math.pow(2,3));
System.out.println(Math.pow(-3,-3));
System.out.println(Math.pow(0,0));
     }
   }
