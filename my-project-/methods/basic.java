import java.util.Scanner ;
public class basic {
    public static void main(String[] args ){
        System.out.println(Math.sqrt(4));
        System.out.println(Math.floor(6.8));
        System.out.println(Math.min(3,9));
        System.out.println(Math.max(9,45));
        System.out.println(Math.cbrt(125));
        System.out.println(Math.abs(-9));

        // three numbers max by using methods 
        Scanner sc = new Scanner  (System.in );
        System.out.print("ENTER THE NUMBER OF A ");
        int a = sc.nextInt();
        Scanner sx = new Scanner ( System.in );
        System.out.print(" ENTER THE NUMBER OF B ");
        int b = sx .nextInt();
        Scanner sb = new Scanner ( System.in );
        System.out.print(" ENETR THE NUMBER OF C ");
        int c = sb .nextInt();
        Scanner sv = new Scanner ( System.in );
        System.out.print("ENTER THE NUMBER OF D ");
        int d = sv.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
        // builts in power function 
        System.out.print(Math.pow(2,3));


    }
}