public class Interfaces {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.move();
        // King k = new King();
        // k.move();


        Student s = new Student();
        s.name();
        s.roll();
        
    }
}

//Mutliple Inheritance using Interfaces
 interface Name {
        void name();
 }

 interface Roll {
    void roll();
 }

 class Student implements Name , Roll {
    public void name (){
        System.out.println("Student name");
    }

    public void roll () {
        System.out.println("Student roll");
    }
 }

interface ChessPlayer {
    void move();
}

class Queen implements ChessPlayer {
   public void move(){ //if donot use public it will become default
        System.out.println("Queen moves");

    }
}

class King implements ChessPlayer {
    public void move(){ 
        System.out.println("King moves");
    }
}