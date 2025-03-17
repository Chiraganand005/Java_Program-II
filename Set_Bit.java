import java.util.Scanner;

class Set_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        
        // Edge case check
        if (num <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
            return;
        }

        // Binary conversion
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary Representation: " + binary);

        // Count Set Bits (1s)
        int setBits = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                setBits++;
            }
        }
        System.out.println("Number of Set Bits (1s): " + setBits);

        // Find LSB Position (Brute Force)
        int LSB_Position = -1;
        int temp = num;
        int position = 0;
        while (temp > 0) {
            if ((temp & 1) == 1) { // Check if the last bit is 1
                LSB_Position = position;
                break;
            }
            temp = temp >> 1;
            position++;
        }
        System.out.println("Position of Least Significant Bit (LSB): " + LSB_Position);

        // Find MSB Position
        int MSB_Position = -1;
        temp = num;
        while (temp > 0) {
            MSB_Position++;
            temp = temp >> 1;
        }
        System.out.println("Position of Most Significant Bit (MSB): " + MSB_Position);

        sc.close();
    }
}
