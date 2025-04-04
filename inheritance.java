// Superclass
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Subclass 
class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name); 
    }
    @Override
    public void speak() {
        System.out.println(name + " barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.speak();  // Output: Buddy barks.
    }
}
