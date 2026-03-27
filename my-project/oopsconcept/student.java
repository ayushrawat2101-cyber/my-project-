public class student {
    int height ;
    int age ;
    int rolllno;
    String name ;
    student(){
       age =98;
    }
    student( int age ){
     this.age = age ;
       this.name = name ;
    }
    student(int age , String name ){
 this.age = age ;
 this.name = name ;
    }
    public static void main(String[] args ){
        student s1 = new student(56,"hyyu");
        System.out.println(s1.age );
        System.out.println(s1.name );
    }
}
