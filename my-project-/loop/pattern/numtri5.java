import java.util.Scanner ;
public class numtri5{
    public static void main(String[] args ){
Scanner sc = new Scanner (System.in );
System.out.print("enter the number of rows ");
int n = sc.nextInt(); 

for(int i =1 ;i<=n;i++){
    int n2 =1;
    for(int j=1;j<=i;j++){
System.out.print(n2+" ");
 n2+=2;
    }
   
    System.out.println(" ");

}

    }
}