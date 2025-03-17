// Final class - Cannot be extended
final class FinalClass {
    // Final variable - Its value cannot be changed
    final int constantValue = 100;

    // Final method - Cannot be overridden
    final void showMessage() {
        System.out.println("This is a final method.");
    }
}

// Since FinalClass is final, we cannot extend it
// class ChildClass extends FinalClass {}  // ❌ ERROR

public class Final {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();

        System.out.println("Final Variable Value: " + obj.constantValue);
        obj.showMessage();

        // Trying to modify final variable (Uncomment to see error)
        // obj.constantValue = 200;  // ❌ ERROR
    }
}
