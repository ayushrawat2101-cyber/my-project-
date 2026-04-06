import java.util.*;
public class occcurence {
    public static void main(String[] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.println("welcome to finding occurence ");
        int[] nums = ArrayUtility.inputArray();
        System.out.print("enter the number you wantto search ");
        int element = sc.nextInt();
        int occ = count(nums,element );
        System.out.println("your element was found : "+occ+"times ");
    }
    public static int count (int[] nums, int element ){
        int occ = 0;
        for(int num:nums){
            if(num==element ){
                occ ++;
            }
        }
        return occ ; 
    }
}
