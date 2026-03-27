public class copytructor {
    String name ;
    int a ;
    float b;
void display(){
    System.out.println(name);
    System.out.println(a);
    System.out.println(b);
}
    copytructor(){
        name = "ayush";
        a = 10 ;
        b = 9.00f;
    }
    copytructor(String name , int a , float b ){
        this.name = name ;
        this.a = a;
        this.b=b;
    }
    public static void main(String[] args ){
copytructor c1 = new copytructor();
copytructor c2 = new copytructor();
System.out.println("this is an object 1 ");
c1.display();
System.out.println("this is an object 2 ");// data of object1 constructor is copied to object 2 constructor
c2.display();
    }
}
