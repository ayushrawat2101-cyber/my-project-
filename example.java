   // for non static functio we make object
    class object1{
        int x ;// instance object member variable 
       private  int y ;// instace object member variable 

void fun1(){
    System.out.println(" A");
}
void fun2(){
    System.out.println(" B ");
}

    }
    
    
    
    class area{
    static void fun1(){
        System.out.println("d");
    }
    static void fun2(){
        System.out.println("e");
    }
   }
   public class example{
   static  void fun1(){
        System.out.println("a ");

    }
     static void fun2(){
        System.out.println("b ");
    }
    public static void main(String[] args ){
       object1 m1 = new object1 ();
       object1 m2 = new object1();
       m2.x = 51;
       m1.x = 5;
       System.out.println(m2.y);



    }
}