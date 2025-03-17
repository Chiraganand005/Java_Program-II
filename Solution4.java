import java.util.Scanner;

class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    vowels++;
                    break;
                default:
                    if (ch >= 'a' && ch <= 'z') {
                        consonants++;
                    }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
