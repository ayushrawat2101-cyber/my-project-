public class paratructor {
    int a;
    int b ;
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
 paratructor(int a , int b ){
    this.a=a;
    this.b=b;
 }
 public static  void main(String[] args ){
paratructor p1 = new paratructor(3,6);
p1.display();
 }
}
