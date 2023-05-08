public class Polymorphism {
    public static void main(String[] args) {

        //For Method Overloading
        Calculator calc = new Calculator();
                System.out.println(calc.sum(3,5));
                System.out.println(calc.sum(3.5f,5.5f));
                System.out.println(calc.sum(3,5,6));
        
        //For Method Overriding
        Deer d = new Deer();
        d.eat(); //child eats called
        
    }
    
}

class Calculator {

    //Method Overloading
    int sum (int a ,int b){
        return a+b;
    }

    float sum(float a ,float b){
        return a+b;
    }
    
    int sum(int a , int b, int c){
        return a+b+c;
    }
}

//Method Overiding
class Animal {
    void eat (){
        System.out.println("Eats Anything");
    }

}

class Deer extends Animal {

    void eat (){
        System.out.println("Eats Grass");

    }
}
