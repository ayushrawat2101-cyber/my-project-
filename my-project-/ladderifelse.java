import java.util.Scanner ;
public class ladderifelse{
    public static void main (String[] args ){
        Scanner sc = new Scanner (System.in );
        System.out.print("enter the value of p : ");
               int p = sc.nextInt();
               if ( p % 5 ==0 && p % 3 ==0){
                System.out.println("the number is divisible by 5 and 3 both ");
               }
else if ( p % 5==0 || p%3==0){
    System.out.println("the number is divisible by 5 or 3 ");
}

else if (p % 3==0){
    System.out.println("the number is divisble by 3 ");
}
else if ( p % 5==0 ){
    System.out.println("the number is divisible by 5 ");
}

else {
    System.out.println("the number is not divisible by 5 and 3 ");
}
    }
}