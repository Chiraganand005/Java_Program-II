// Parent class
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding the makeSound() method
class Dog extends Animal {
    // Overriding the method
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Another Child class overriding the method differently
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Main class
public class Method_overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Calls parent class method

        Animal myDog = new Dog();
        myDog.makeSound();  // Calls overridden method in Dog class

        Animal myCat = new Cat();
        myCat.makeSound();  // Calls overridden method in Cat class
    }
}

