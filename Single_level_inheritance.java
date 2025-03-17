class Parent {
    void showMessage() {
        System.out.println("Hello from Parent class");
    }
}

class Child extends Parent {
    void displayMessage() {
        System.out.println("Hello from Child class");
    }
}

public class Single_level_inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showMessage(); // Inherited from Parent
        obj.displayMessage(); // Defined in Child
    }
}
