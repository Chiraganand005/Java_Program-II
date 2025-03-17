class Parent {
    void showParentMessage() {
        System.out.println("Message from Parent");
    }
}

class Child1 extends Parent {
    void showChild1Message() {
        System.out.println("Message from Child1");
    }
}

class Child2 extends Parent {
    void showChild2Message() {
        System.out.println("Message from Child2");
    }
}

public class Hierachial {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        obj1.showParentMessage();
        obj1.showChild1Message();

        Child2 obj2 = new Child2();
        obj2.showParentMessage();
        obj2.showChild2Message();
    }
}
