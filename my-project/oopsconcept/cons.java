public class cons{
int no0fwheels;
float maxspeed;
String color;
cons(){         
       no0fwheels= 4 ;
    maxspeed = 40;
    color= "BLACK ";
}
public static void main(String[] args ){
    cons c = new cons();
    cons c1 = new cons();
    cons c2 = new cons();
    System.out.println(c.no0fwheels);
    System.out.println(c1.color);
    System.out.println(c2.maxspeed);
}
}