public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "jaspreet";
        s1.roll = 101;
        s1.mark = new int[3];
        s1.mark[0] = 100;
        s1.mark[1] = 101;
        s1.mark[2] = 102;

        System.out.println("Name: " + s1.name +   "  Roll: " + s1.roll);
        System.out.println("Mark: " + s1.mark[0] + " " + s1.mark[1] + " " + s1.mark[2]);


        Student s2 = new Student(s1);

        //changing marks[2]
        s2.mark[2] = 103;
        System.out.println("Name: " + s2.name +   "  Roll: " + s2.roll);
        System.out.println("Mark: " + s2.mark[0] + " " + s2.mark[1] + " " + s2.mark[2]);
    }
}

class Student {
    String name;
    int roll;
    int mark[];

    Student(){
        System.out.println();
    }
    //Shallow copy
    // Student ( Student s){
    //     this.name = s.name;
    //     this.roll = s.roll;
    //     this.mark =  s.mark;
    // }

    //Deep copy
    Student (Student s){
        this.name = s.name;
        this.roll = s.roll;
        //new array
        this.mark = new int[s.mark.length];
        for(int i = 0; i < s.mark.length; i++){
                    this.mark[i] = s.mark[i];
                }
    }
}