// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a;  // Reference of base class

        a = new Dog();  // Object of Dog
        a.sound();      // Calls Dog's version

        a = new Cat();  // Object of Cat
        a.sound();      // Calls Cat's version
    }
}
