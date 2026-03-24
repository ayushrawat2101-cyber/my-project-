public class car1{
    int noofwheels;//instance variable 
    float speed;
    String color;
    public car1 start(){
        System.out.println("car is starting bruhh.....");
        return this;
    }
    public void drive(){
        System.out.println("car is driving");
    }
    public void fuel(){
        System.out.print("current fuel level ");
    }
    public static void main(String[] args ){
car1 mycar =new car1();
mycar.start().drive();                          
    }
}
