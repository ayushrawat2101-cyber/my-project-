import java.util.Scanner ;
public class floydtri{
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print("enter the number of rows ");
        int n = sc.nextInt();
        int n2=1;
        for(int i = 1;i<=n;i++){
            for ( int j =1;j<=i;j++){
                System.out.print(n2 + " ");
                n2++;
            }
            
          
            System.out.println(" ");
        }
    }
}