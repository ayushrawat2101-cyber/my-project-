public class book {
    int isbn ;
    String title ;
    String author;
    static int totalbooks;
    boolean isborrowed;
      book(String title ,String author , int isbn){
this.title = title ;
this.author = author ;
this.isbn= isbn ;
        }
    void borrowbooks(){
if( isborrowed){
    System.out.print("book is taken by someone else please wait ");
}
else {
    this.isborrowed = true ;
    System.out.println(" enjoy the book ");
}
    }
    void returnbook(){
        if(isborrowed){
           this.isborrowed = false ;
           System.out.println("hope you read  it !...");
        }
        else {
System.out.println("book is in library ");
        }

    }
    static{
        totalbooks=0;
    }{
totalbooks += 1 ;
    }//object created 
    static int gettotalnoofbooks(){
        return totalbooks;
    }
        public static void main(String[] args ){
book b1 = new book("mechanics","einstein",123333344);
System.out.println(book.gettotalnoofbooks());
b1.borrowbooks();
b1.returnbook();
    }
}