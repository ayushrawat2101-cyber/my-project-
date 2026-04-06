import java.util.Scanner;
public class circle {
    double radius;
    circle ( double radius ){
this.radius=radius;
    }
    double circumference(){
return 2 * Math.PI * radius ;
    }
    double area ( ){
        return Math.PI * Math.pow(radius , 2 );
    }
    public String toString(){
        return " circle calc : "+ "area is : " + area()
        +" "+"circumference is : "+ circumference();
    }
    
    public static void main(String[] args ){
        Scanner sc = new Scanner (System.in);
System.out.println("welcome to calc of circle ");
System.out.println("please enter your radius ");
 double radius = sc.nextDouble();
circle c1 = new circle ( radius );
System.out.print(c1);
    }
}
