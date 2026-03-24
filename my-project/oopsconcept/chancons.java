public class chancons {
int noofwheels;
String color ;
float speed ;
chancons(String color ){
    this.color = color ;
    speed = 50 ;
    noofwheels=5;
}
chancons(int nooofwheels){
    this.noofwheels = noofwheels;
}
chancons(){
    color = "black ";
speed = 90;
}
public static void main(String[] args ){
    chancons c1 = new chancons();
    System.out.println(c1.color);
    System.out.println(c1.speed);
    System.out.println(c1.noofwheels);

    
}
}
