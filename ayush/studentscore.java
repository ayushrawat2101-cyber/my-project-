import java.util.*;
public class studentscore {
    void show(){
         Scanner sc = new Scanner ( System.in );
        System.out.println("ENTER THE MARKS ");
        int marks = sc.nextInt();
        String  check = (( marks > 80 )? "GRADE A ":((marks >50 )?"grade b ": "grade c "));
        System.out.print(check);
    }
    public static void main(String[] args ){
       studentscore s1 = new studentscore();
       s1.show();
    }
}
