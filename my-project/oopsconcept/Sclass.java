public class Sclass{
    static int a = 9 ;
    static  String name = " darksha ";
    public static class student  {
        void show (){
System.out.println(a);
System.out.print(name);
        }
    }
    public static void main(String[] args ){
        student s1 = new student();
        s1.show();
    }
}