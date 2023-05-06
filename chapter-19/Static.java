public class Static {
    public static void main(String[] args) {
        Student student = new Student();

        student.schoolName = "KV";

        Student student2 = new Student();
        System.out.println(student2.schoolName);

        Student student3 = new Student();
        student3.schoolName = "DPS";

        
        System.out.println(student2.schoolName);
        
    }
    
}

class Student {
        String name;
        int roll;

    //making static so only declared one type for all 
    static String schoolName ;
    
    static int markPercentage (int maths , int phy , int chem ){
        return (maths + phy + chem) / 3;
    }

}
