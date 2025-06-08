// File name: inharitance.java
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class inharitance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5);
        dog.bark();
        dog.displayInfo();
    }
}
