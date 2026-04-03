import java.util.Scanner ;
public class Stwh{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE DAY NUMBER : ");
         int day = sc.nextInt();
        //OLD(day);
        NEW (day );
    }

    public static void NEW(int day ){
        String daystr= switch (day) {
            case 1 -> "monday ";
case 2 -> "tuesday";
case 3 -> "wednesday";
case 4 -> "thrusday";
case 5 -> "friday";
case 6 -> "saturday";
case 7 -> "sunday";
default -> "invalid";

        };
        System.out.println(daystr );
    }

    
    
//     public static void OLD(int day){
// switch(day ){
// case 1 : 
// System.out.print("its monady ");
// break ;     
// case 2 : 
// System.out.print("its tuesday ");
// break ; 
// case 3 : 
// System.out.print("its wednesday  ");
// break ; 
// case 4 : 
// System.out.print("its THRUSDAY  ");
// break ; 
// case 5 : 
// System.out.print("its friday  ");
// break ; 
// case 6 : 
// System.out.print("its saturday  ");
// break ; 
// case 7 : 
// System.out.print("its sunday  ");
// break ; 
// default : 
// System.out.print("invalid ");
// break ;
//     }
// }
}