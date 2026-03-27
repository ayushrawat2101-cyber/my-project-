public class privatetructor {
    private privatetructor(){
System.out.println("in this object is created with in the class in a static function ");
    }
    static void show(){
        privatetructor p1 = new privatetructor();
    }
    public static void main(String[] args ){
        privatetructor.show();
    }
}
