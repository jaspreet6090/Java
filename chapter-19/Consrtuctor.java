public class Consrtuctor {
    public static void main(String[] args) {
        Student s1 = new Student();
        //You can set like this else call the constructor
        s1.name = "jaspreet";
        s1.roll = 101;
        s1.password = "password";
        //Parametersied Constructors Used
        Student s2 = new Student("ishika" , 102 , "newpassword");
        //Copy constructor used
        Student s3 = new Student(s1);

        //printing the Value using another Object S4
       Student s4 = new Student();
        s4.print(s1);
        s4.print(s2);
        s4.print(s3);
    } 
}

class Student {
    String name;
    int roll;
    String password;

    //Non Parametersied Constructors
    Student(){
        System.out.println("Default Constructor");
    }

    //Parametersied Constructors
    Student(String name, int roll, String password){
            this.name = name;
            this.roll = roll;
            this.password = password;
        }

    //Copy Constructors
    Student(Student s){
            this.name = s.name;
            this.roll = s.roll;
            this.password = s.password;
        }
    //Method to Print
    void print(Student s){
            System.out.println("Name : " + s.name + "\n Roll : " + s.roll + "\n Password : " + s.password );
        }
}
