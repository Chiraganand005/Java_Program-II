class Parent {
    static void staticMethod() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Static method in Child");
    }
}

public Solution{
    public static void main(String[] args) {
        Parent.staticMethod(); // Calls Parent's static method
        Child.staticMethod(); // Calls Child's static method
    }
}
