import java.util.Scanner;

class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " is the greatest");
        }
        if (b > a) {
            System.out.println(b + " is the greatest");
        }
        if (a == b) {
            System.out.println("Both are equal");
        }
    }
}
