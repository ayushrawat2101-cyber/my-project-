import java.util.*;
public class ArrayUtility {
    public static int[] inputArray(){
Scanner sc = new Scanner (System.in);
System.out.print("enter the number of elments ");
int size =sc.nextInt();
int[] nums = new int[size];
int i = 0;
while ( i<size ){
System.out.print("please enter the element number " + (i+1)+ ":");
nums[i]=sc.nextInt();
i++;
}
return nums ;
    }
}
