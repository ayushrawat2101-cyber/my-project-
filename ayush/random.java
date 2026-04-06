// public class diceroll {
//     int roll(){
//         double random = Math.random()*6;
//          return  (int )(Math.ceil(random));
//     }
//         public static void main(String[] args ){
//             diceroll d1 = new diceroll();
// for(int i =1 ;i<=10;i++){
// System.out.println(d1.roll());
// }
//     }
// }
public class random {
    public static void main(String[] args ){
        for(int i =1 ;i <=3;i++){
       double  a = Math.random()*6;
        System.out.println(a);
        System.out.print((int ) Math.ceil(a));
        }
    }
}
