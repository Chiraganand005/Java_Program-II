import java.util.Stack;
import java.util.Scanner;

class PostFix_Expression{
    public int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        int operandCount = 0;
        int operatorCount = 0;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // Agar operand hai toh stack me push karo
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Converting character to integer
                operandCount++;
            }
            // Agar operator hai toh do operands pop karo
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operatorCount++;
                // Agar operands 2 se kam hain, invalid hai
                if (stack.size() < 2) {
                    return Integer.MIN_VALUE;
                }
                int b = stack.pop(); // Second operand
                int a = stack.pop(); // First operand

                // Evaluate operation
                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        if (b == 0) return Integer.MIN_VALUE; // Division by zero check
                        stack.push(a / b); // Integer division
                        break;
                }
            }
            // Agar invalid character hai
            else {
                return Integer.MIN_VALUE;
            }
        }

        // Final checks:
        // - Ek hi result bacha ho stack me
        // - Operands hamesha Operators + 1 hone chahiye
        if (stack.size() != 1 || operandCount != operatorCount + 1) {
            return Integer.MIN_VALUE;
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PostFix_Expression obj = new PostFix_Expression();
        
        System.out.print("Enter the postfix expression: ");
        String expression = sc.nextLine();
        
        // Agar input khali hai toh invalid
        if (expression.isEmpty()) {
            System.out.println("Invalid Expression");
            return;
        }

        int result = obj.evaluatePostfix(expression);

        // Agar result Integer.MIN_VALUE hai toh invalid expression
        if (result == Integer.MIN_VALUE) {
            System.out.println("Invalid Expression");
        } else {
            System.out.println("Output: " + result);
        }

        sc.close();
    }
}
