class GrandParent {
    void greet() {
        System.out.println("Hello from GrandParent");
    }
}

class Parent extends GrandParent {
    void displayParentMessage() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void showChildMessage() {
        System.out.println("Hello from Child");
    }
}

public class Multi_Level {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet(); // Inherited from GrandParent
        obj.displayParentMessage(); // Inherited from Parent
        obj.showChildMessage(); // Defined in Child
    }
}
