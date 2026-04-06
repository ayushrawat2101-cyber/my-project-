import java.util.*;
public class guess {
    public static void main(String[] args ){
        int n ;
        do{
            Scanner sc = new Scanner ( System.in );
            System.out.print(" guess the number betwwen 1 to 100 ");
            n = sc.nextInt();
        }while(n != 8 );
        System.out.print("you won you guess the right number ");

    }
}
