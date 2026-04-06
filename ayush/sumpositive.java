public class sumpositive {
    public static void main(String[] args ){
        System.out.print("welcome to adding positive number ");
        int[] numarr = ArrayUtility.inputArray();
        int sum =0 ;
        for(int num : numarr ){
if(num < 0 ){
    continue ;
}
sum +=num ;
        }
         System.out.println("the sum of positive number is : "+ sum);
    }
   
}
