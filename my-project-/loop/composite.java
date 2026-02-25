import java.util.Scanner ;
public class composite {
    public static void main(String[] args){
Scanner sc = new Scanner ( System.in);
System.out.println( " enter the number ");
int n = sc .nextInt();
for( int i = 2 ;i<=n-1;i++){
    if( n % i==0 ){
        System.out.println( "the number is an composite number ");
            }
            else {
                System.out.println( " the number is not an composite number ");
            }
            break;
}

}
}