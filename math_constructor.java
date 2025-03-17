class MathOperations {
    int a, b;

    // Default Constructor
    MathOperations() {
        this.a = 0;
        this.b = 0;
    }

    // Parameterized Constructor
    MathOperations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to add two numbers
    int add() {
        return a + b;
    }

    // Method to subtract two numbers
    int subtract() {
        return a - b;
    }

    // Displaying values
    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }
}

public class math_constructor {
    public static void main(String[] args) {
        // Using Default Constructor
        MathOperations obj1 = new MathOperations();
        System.out.println("Using Default Constructor:");
        obj1.display();
        System.out.println("Addition: " + obj1.add());
        System.out.println("Subtraction: " + obj1.subtract());

        System.out.println("\nUsing Parameterized Constructor:");
        // Using Parameterized Constructor
        MathOperations obj2 = new MathOperations(10, 5);
        obj2.display();
        System.out.println("Addition: " + obj2.add());
        System.out.println("Subtraction: " + obj2.subtract());
    }
}
