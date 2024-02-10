import java.util.Stack;

class PostfixConverter {
    // Get the precedence of an operator
    static int getPrecedence(char operator) {
        return switch (operator) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }

    // Convert infix expression to postfix
    static String convertToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (char nextCharacter : infix.toCharArray()) {
            if (Character.isWhitespace(nextCharacter)) {
                continue; // Skip whitespace characters
            }

            if (Character.isLetterOrDigit(nextCharacter)) {
                postfix.append(nextCharacter); // Append operands to postfix
            } else if (nextCharacter == '(') {
                operatorStack.push(nextCharacter); // Push opening parenthesis to stack
            } else if (nextCharacter == ')') {
                // Pop operators from stack to postfix until opening parenthesis is found
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop(); // Discard the opening parenthesis
                } else {
                    return "Expression syntax error"; // Unmatched closing parenthesis
                }
            } else {
                // Pop operators with higher or equal precedence from stack to postfix
                while (!operatorStack.isEmpty() && getPrecedence(nextCharacter) <= getPrecedence(operatorStack.peek())) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(nextCharacter); // Push the current operator to stack
            }
        }

        // Pop any remaining operators from stack to postfix
        while (!operatorStack.isEmpty()) {
            char topOperator = operatorStack.pop();
            if (topOperator == '(') {
                return "Expression syntax error"; // Unmatched opening parenthesis
            }
            postfix.append(topOperator);
        }

        return postfix.toString();
    }
}

public class PostfixConverterTest {
    public static void main(String[] args) {
        String infixExpression = "a + b * (c ^ d - e) ^ (f + g * h) - i";
        String postfixExpression = PostfixConverter.convertToPostfix(infixExpression);

        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}

