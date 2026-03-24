public class paracons{
    String color ;
    float price ;
    paracons(String color, float price  ){
       this.color = color;
        this.price = price;
    }
    public static void main(String[] args ){
      paracons c1 = new paracons("black", 700) ;
      System.out.println(c1.color);
      System.out.println(c1.price);
    }
}