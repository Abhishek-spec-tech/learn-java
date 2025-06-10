// File: AbstractionExample.java
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Normal method
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();  // Dog barks
        a.eat();        // This animal eats food
    }
}
