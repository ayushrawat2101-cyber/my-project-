import java.util.Scanner ;

public class test{
    public static void  main(String[] args ){
        int[] num  = new int [5];
        for ( int i = 1 ; i<=4;i++){
            Scanner sc = new Scanner (System.in );
            num[i]= sc.nextInt();
        }
        for ( int i = 0 ; i<5;i++){
             int r = num[i] + num [i+1];
             int target = 9 ;
      if(target==r){
            System.out.println(r);
        }

    }
}
}