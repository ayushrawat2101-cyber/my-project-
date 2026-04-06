import java.util.*;
public class Exitonexit{
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        while(true ){
            System.out.print("enter your command ");
            String command = sc.next();
            if(command.equalsIgnoreCase("exit")){
                break ;
            }
        }
        System.out.print("you have succesfully exited ");
    }
}