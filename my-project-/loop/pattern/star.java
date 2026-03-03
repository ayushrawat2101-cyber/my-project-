import java.util.Scanner;
public class star{
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System .in );
        System.out.println( " enter the rows ");
        int rows = sc.nextInt();
        Scanner sb = new Scanner ( System.in );
        System.out.println( " enter  the column " );
        int col = sb.nextInt();
    for( int i = 0 ; i<rows;i++){
     for ( int j =0 ;j<col ;j++){
        System.out.print(" * ");
     }
     System.out.println(" ");
    }
    }
}