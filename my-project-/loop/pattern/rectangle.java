import java.util.Scanner ;
public class rectangle {
    public static void main (String[] args ){
        Scanner sx = new Scanner (System.in );
        System.out.print(" enter the no of rows ");
        int n = sx .nextInt();
        for ( int i = 1 ;i<=n ; i++){
            for ( int j = 1 ;j<=n+3;j++){
                System.out.print(" * "+ " ");
            }
            System.out.println(" ");
        }
    }
}