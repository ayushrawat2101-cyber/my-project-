public class largesthree{
    public static int  three(int a ,int b ,int c ){
        if (a>=b && a>=c)
         return a;
        else if ( b >=a && b>=c)
        return b; 
    else 
        return c ;
    }
    public static void main(String[] args ){
        System.out.print(three(5,9,2));

    }
}
