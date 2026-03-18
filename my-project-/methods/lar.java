public class lar {
    public static void main(String[]  args ){
       System.out.println( larg(2,9,8));
    }
    public static int larg (int a , int b , int c ){
        int x = Math.max((Math.max(a,b)),c);
        System.out.println(x);
        return x;
    }
}