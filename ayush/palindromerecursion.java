import java.util.*;
public class palindromerecursion {
    public static void main(String[] args ){
        System.out.print("welcome to palindrome checker ");
        Scanner sc = new Scanner ( System.in );
        String str = sc.next();
        System.out.print("your string is " + ((ispalindrome(str))?"palindrome ": " not palindrome "));
    }
    public static boolean ispalindrome ( String str ){
        if ( str.length() <=1 ){
        return true  ;
    }
    int lastpos = str.length()-1;
    if(str.charAt(0)!=str.charAt(lastpos)){
        return false ;
    }
    String newstr = str.substring(1,lastpos);
    return ispalindrome(newstr);

    }
}
