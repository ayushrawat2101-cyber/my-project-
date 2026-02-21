import java.util.Scanner ;
public class rectangle {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rectangle ");
        int length = sc.nextInt();
        Scanner sx = new Scanner (System.in );
        System.out.print("enter the breadth of rectangle ");
        int breadth = sx.nextInt();
        int area = length * breadth ;
        int perimeter = 2 * ( length + breadth );
        System.out.println("the area of rectangle is : "+ area );
        System.out.println("the perimeter of rectangle is :" + perimeter);
    if ( area > perimeter ){
        System.out.println( " the area of rectangle is greater than its perimeter ");

    }
    else {
        System.out.println("the area of rectangle is less than its perimeter ");
    }



    }
}