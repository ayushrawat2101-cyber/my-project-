public class tructor{
      int tyres ;
      int price ;
      String color ;
      void show ( ){
System.out.println( tyres );
System.out.println(price);
System.out.print(color);
      }
      tructor(){
        tyres = 5 ;
        price = 400;
        color = " red ";
      }
      public static void main( String[] args ){
        tructor t1 = new tructor();
        t1.show();
      }
}
