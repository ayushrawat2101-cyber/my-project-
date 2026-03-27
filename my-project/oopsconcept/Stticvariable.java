public class Stticvariable{
    static String college = "mviet"; //static variable 
    String name;
    Stticvariable(String name ){
        this.name = name ;
    }
    void display ( ){
        System.out.print(name + " "+ college);
    }
    public static void main(String[] args ){
        Stticvariable s1 = new Stticvariable("ayush ");
        s1.display();
    }
}