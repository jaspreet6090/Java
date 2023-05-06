public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Color = "Brown";
        System.out.println(d.Color);
        d.eat();
        d.sound();
    }
}

//Base class 
class Animals {
    String Color;

    public void eat() {
        System.out.println("eating");
    }
}

//Child class

class Dog extends Animals {
    String Breed;

    public void sound() {
        System.out.println("woof");
    }
}