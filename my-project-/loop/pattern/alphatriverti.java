import java.util.Scanner ;
public class alphatriverti{
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print(" enter the number of rows ");
        int n = sc.nextInt();
        int l =65;
        for(int i =1;i<=n;i++){
            for(int k =1 ;k<=n-i;k++){
                System.out.print(" ");
            }
            for( int  j = 1 ; j<=i;j++){
                System.out.print((char)l);
            }
            l++;
            System.out.println(" ");
        }
    }
}