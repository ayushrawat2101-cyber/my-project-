import java.util.Scanner ;
public class nnumalpha{
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print(" enter the no of rows ");
        int n = sc .nextInt();
        for ( int i = 1 ;i<=n;i+=2){// yh looop no of rows bata rha hai 
            for ( int j = 1 ;j<=i;j++){// first linne num print kar rha h 
                System.out.print(j+" ");
            }
                System.out.println(" ");
                for(int k = 65;k<=65+i;k++){
                    System.out.print((char)k+" ");
                }
                System.out.println(" ");
            
        }
    }
}