import java.util.*;
public class FOREACH {
    public static void main(String[] args ){
        String[] array = new String[]{
            "ram ", " ayush ", " saurabh "
        };
        //printArray(array);
        printArray(array);
    }
//     public static void printArray(String[] array ){
//         for(int i = 0 ; i< array.length;i++){
// System.out.println(array[i]);
//         }
//     }
public static void printArray(String[] array){
    for(String name : array ){
        System.out.println(name );
    }
}
}
