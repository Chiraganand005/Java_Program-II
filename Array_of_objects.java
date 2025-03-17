import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    // Constructor to initialize Student object
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

public class Array_of_objects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking the number of students as input
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        // Creating an array of Student objects
        Student[] students = new Student[n];

        // Taking student details as input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            sc.nextLine(); // Consume newline
            String name = sc.nextLine();
            System.out.print("Enter roll number of student " + (i + 1) + ": ");
            int rollNo = sc.nextInt();

            // Creating object and storing in array
            students[i] = new Student(name, rollNo);
        }

        // Displaying student details
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }

        sc.close();
    }
}
