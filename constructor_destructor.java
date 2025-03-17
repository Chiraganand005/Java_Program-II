class Demo {
    // Instance Variables
    private String name;

    // Constructor
    Demo(String name) {
        this.name = name;
        System.out.println("Constructor called: Object " + name + " Created!");
    }

    // Destructor Simulation using finalize()
    protected void finalize() {
        System.out.println("Destructor called: Object " + name + " Destroyed!");
    }
}

public class constructor_destructor {
    public static void main(String[] args) {
        // Creating objects inside a block
        {
            Demo obj1 = new Demo("A");
            Demo obj2 = new Demo("B");
        } // Objects go out of scope here

        // Requesting Garbage Collection
        System.gc();

        System.out.println("End of main method.");
    }
}
