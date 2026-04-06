import java.util.*;
public class maxArray{
    public static void main(String[] args ){
        int[] arr = ArrayUtility.inputArray();
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if( max < num ){
                max = num ;
            }
        }
        System.out.print("the maximum elemnt is "+ max ) ;

    }
}
