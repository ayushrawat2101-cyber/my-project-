import java.util.Scanner ;
public class quadrant {
    public static void main (String[] args ){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value  of x ");
        int x = sc.nextInt();
        Scanner sx = new Scanner ( System.in );
        System.out.println("enter the value of y ");
        int y = sx.nextInt ();
    

if ( x >= 0 &&  y >= 0 ){
System.out.println( " the point lies on 1 st quadrant ");
}

 if ( x >0 &&  y < 0 ){
System.out.println( " the point lies on 2nd  quadrant ");
}

 if ( x < 0 &&  y < 0 ){
System.out.println( " the point lies on 3rd  quadrant ");
}
        if ( x < 0 &&  y > 0 ){
        System.out.println( " the point lies on 4 th  quadrant ");
        }

          if ( x ==0 && y==0 ){
        System.out.println("the point is at origin ");
     }
     else   if ( x != 0 && y==0 ){
        System.out.println("the point is at  x axis ");
     }
      else if ( x == 0 && y !=0 ){
        System.out.println("the point is at y axis ");
     }
    }
}