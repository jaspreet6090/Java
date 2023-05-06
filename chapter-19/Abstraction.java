public class Abstraction {
    public static void main(String[] args) {
            
        //Animal animal = new Animal();  (cannot do this because abstract class)

        Dog d = new Dog();
        d.eat();
        d.walk();

                Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

//creating a abstract Class 
//Note thet we cannot create a object for the abstract class
abstract class Animal {
    void eat(){
        System.out.println("eating");
    }

    //Creating a abstract Method
    // Note we cannot create a method for the abstract which means we just decalre not implement

    abstract void walk();
}

class Dog extends Animal {
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}