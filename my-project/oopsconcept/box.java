public class box {
    int l;
    int b;
    int h;
    box(){
        this(5);
        System.out.println(l);
        System.out.println("default parameter ");

    }
    box(int l ){
        this ( l ,20 );
        System.out.println(l);
        System.out.println(b);
        System.out.println("one parameter ");
    }
    box(int l ,int b ){
        this.l=l;
        this.b=b;
        h= 30 ;
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);
        System.out.println("two parameter ");

    }
    public static void main(String[] args ){
        box mybox = new box();
    }
}