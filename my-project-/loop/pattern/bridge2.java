import java.util.Scanner;
public class bridge2{
    public static void main(String[] args ){
        Scanner sc = new Scanner (System.in);
        System.out.print("ENTER THE NUMBER OF ROWS ");
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            System.out.print("*"+" ");
        }
        System.out.println(" ");
        int nst =n-1;
        int nsp =1;
        for(int i =1;i<=n-1;i++){
            for(int j = 1 ;j<=nst;j++){
                System.out.print("*"+" ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" "+" ");
            }
            for(int l = 1;l<=nst;l++){
                System.out.print("*"+" ");
            }
            nsp+=2;
            nst--;
            System.out.println(" ");
        }
    }
}