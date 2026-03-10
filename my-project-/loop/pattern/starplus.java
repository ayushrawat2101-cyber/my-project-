import java.util.Scanner ;
public class starplus{
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in);
        System.out.print("enter the number of rows ");
        int n = sc.nextInt();
        for ( int i =1 ;i<=n;i++){
            for ( int j = 1;j<=n;j++){
                if(i==3||j==3){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
}