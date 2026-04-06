import java.util.*;
public class guessgame  {
int random ;
guessgame(){
    random = (int )Math.ceil(Math.random()*100);
}
/**
 * return negative if the number is smaller 
 * return positive if the number is higher 
 * o if the number is correct 
 */
int guess(int guessnumber){
    return guessnumber  - random ;
}
 public static void main(String[] args ){
    Scanner sb = new Scanner (System.in);
    guessgame g1 = new guessgame();
    System.out.println("WELCOME TO NUMBER GUESSING GAME . GUESS ANY NUMBER BETWEEN 1 - 100");
    int guess;
    int result;
    do{
        System.out.print("GUESS THE NUMBER ");
        guess = sb.nextInt();
        result = g1.guess(guess);
        if(result == 0 ){
            System.out.println("congrats you guesss the wright number! you win ");
        }else if(result<0){
System.out.println("wrong you guess too low ");
        }
        else {
            System.out.println("you guess too higher ");
        }
    }while ( guess !=0 );
 }
}