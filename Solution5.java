import java.util.Scanner;

class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the greatest");
            } else {
                System.out.println(c + " is the greatest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is the greatest");
            } else {
                System.out.println(c + " is the greatest");
            }
        }
    }
}
