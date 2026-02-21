// when different class is used and call a non static function 

 class axis{
    void fun1()
    {       System.out.println("w");
   }
   static void fun2 (){
    System.out.println("q");
   }
}
public class object2{
   static void fun1(){
        System.out.println("b");
    }
     static void fun2 (){
        System.out.println("c ");
    }
    public static  void main(String[] args ){
        System.out.println("a ");
        fun1();
        fun2();
        axis a1 = new axis();
        a1.fun1();
        axis.fun2();

    }
}
