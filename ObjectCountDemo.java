class ObjectCounter {
    // Static variable to count the number of objects
    static int count = 0;

    // Constructor to increment count when object is created
    ObjectCounter() {
        count++;
    }

    // Method to display the number of objects created
    void displayCount() {
        System.out.println("Total Objects Created: " + count);
    }
}

public class ObjectCountDemo {
    public static void main(String[] args) {
        // Creating multiple objects
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        
        // Displaying the number of objects created
        obj3.displayCount();  // Can be called using any object
    }
}
