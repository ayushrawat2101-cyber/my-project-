public class carfinal {
    final int noofwheels ;
    final String model ;
    final String engineinlitres ;
    public carfinal(int noofwheels , String model , String engineinlitres ){
        this.noofwheels  = noofwheels ;
        this.model =  model ;
        this .engineinlitres = engineinlitres ;
    }
    void show(){
        System.out.println(noofwheels);
    }
    public static void main(String[] args ){
        carfinal f1 = new carfinal(5,"1ahuv2","6l");
        f1.show();
    }
}
