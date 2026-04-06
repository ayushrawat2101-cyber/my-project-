public class student3 {
    
        String name ;
        int age ;
        String course ;
        int rollno ;
          public student3(String name , int age , String course , int rollno){
            this.name = name ;
            this.age = age ;
            this.rollno = rollno ;
            this.course = course ;
        }
        // public String toString (){
        //     return "student Details : {name : "+name
        //      +  "age :" + age 
        //      +  "rollno :"+ rollno
        //      +  "course : "+ course +"}";
        // } 
        public static void main(String[] args ){
            student3 s1 = new student3("ayush", 20 ,"btech ",001 );
            System.out.print(s1);

                }        
            }

