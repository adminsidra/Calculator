class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        Animal obj2 = new Dog(); // Upcasting
        
        obj1.sound(); // Calls Animal's method
        obj2.sound(); // Calls Dog's overridden method
    }
}
