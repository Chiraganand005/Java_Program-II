import java.util.Scanner;

class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long factorial = 1;

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
