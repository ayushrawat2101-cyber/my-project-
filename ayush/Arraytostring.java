public class Arraytostring {
    public static void main(String[] args ){
        String[] arr = new String[] {"this ","is the ", " most ", "best and ","detailed ","cousrse ", "of ", "java ", " on youtube "};
        StringBuilder  sb = new StringBuilder();
        for(String str : arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
