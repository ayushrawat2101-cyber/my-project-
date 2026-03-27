import java.util.Scanner;
public class numberspiral{
    public static void  main (String[] args ){
        Scanner sc = new Scanner (System.in);
        System.out.print("ENTER THE NUMBER OF ROWS ");
        int n = sc.nextInt();
        for(int i = 0 ;i<=2*n-1;i++){
            for(int j =0;j<=2*n-1;j++){
                int a =i;
                int b=j;
                 int a1 =2*n-i;
                  int b1 =2*n-j;
                
                 System.out.print(Math.min(a,b)+" ");
            }
            System.out.println(" ");
        }
    }
}