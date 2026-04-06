public class car {
    int nooofwheels ;
    int noofdoor;
    int maxspeed ;
    String name ;
    String company;
    public car( int nooofwheels, int noofdoor, String name , String company, int maxspeed ){
        this.nooofwheels = nooofwheels;
        this.noofdoor = noofdoor ;
        this.maxspeed = maxspeed ;
        this.name = name ;
        this.company= company ;
    }
    public String toString(){
       return " my car name is "+name ;
    }
    public static  void main ( String[] args ){
        car swift= new car(4, 4, "swift", "maruti ", 50 );
        System.out.println(swift.toString());
      
    }

}
