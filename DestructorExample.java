class DestructorExample {
    int value;

    DestructorExample(int value) {
        this.value = value;
        System.out.println("Object created with value: " + value);
    }

    // finalize() method (Deprecated)
    @Override
    protected void finalize() {
        System.out.println("Destructor called for value: " + value);
    }

    public static void main(String[] args) {
        DestructorExample obj1 = new DestructorExample(10);
        DestructorExample obj2 = new DestructorExample(20);

        obj1 = null; // Eligible for Garbage Collection
        obj2 = null; // Eligible for Garbage Collection

        // Requesting GC manually (not guaranteed)
        System.gc();

        System.out.println("End of program");
    }
}
