class Shape {
    // Area of Circle: π * r²
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle: length * breadth
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle: ½ * base * height
    double area(int base, int height) {
        return 0.5 * base * height;
    }

    // Area of Square: side²
    int area(int side) {
        return side * side;
    }
}

public class Overload_method {
    public static void main(String[] args) {
        Shape s = new Shape();

        System.out.println("Area of Circle (radius 5): " + s.area(5.0));
        System.out.println("Area of Rectangle (length 4, breadth 6): " + s.area(4.0, 6.0));
        System.out.println("Area of Triangle (base 5, height 8): " + s.area(5, 8));
        System.out.println("Area of Square (side 4): " + s.area(4));
    }
}
