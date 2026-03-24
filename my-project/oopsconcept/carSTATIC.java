public class carSTATIC {
   int noofwheels;
   float fuels;
   String color ;
   static int age = 18 ;//static variable 
   public static void show () {//static methods
    System.out.println("car is driving ");
   }
   void car(){
    System.out.println("car is moving  ");
   }

   public static void main(String[] args ){
    carSTATIC c = new carSTATIC();
    c.fuels = 34;
    System.out.println(carSTATIC.age);
    System.out.println(c.fuels);
    carSTATIC.show();
    carSTATIC c1 = new  carSTATIC();
    c1.car();

   }
}