interface A {
    default void show() {
        System.out.println("Show from Interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Show from Interface B");
    }
}

class C implements A, B {
    public void show() {
        // Resolving Diamond Problem
        A.super.show();
        B.super.show();
        System.out.println("Show from Class C");
    }
}

public class Multiple  {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
