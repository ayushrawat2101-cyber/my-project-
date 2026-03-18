import java.util.Scanner ;
public  class pnc {
    public static int fact (int x ){
        int Fact =1 ;
        for(int i =1 ;i<=x;i++){
            Fact *=i;
        }
        return Fact;
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print("ENTER THE NNUMBER ");
        int n = sc.nextInt();
        Scanner sx = new Scanner ( System.in );
        System.out.print("ENTER THE VALUE OF SECOND NUMBER ");
        int r = sx.nextInt();
        int ncr = fact(n)/(fact(r)*fact(n-r));
        System.out.print(ncr);
    
    }
}