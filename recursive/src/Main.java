import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Enter the fourth number: ");
        int num4 = scanner.nextInt();

        System.out.println("Enter the fifth number: ");
        int num5 = scanner.nextInt();

        int sum = calculateSum(num1, num2, num3, num4, num5);
        System.out.println("The sum of the numbers is: " + sum);
    }

    public static int calculateSum(int num1, int num2, int num3, int num4, int num5) {
        // base case: if all numbers have been processed, return 0
        if (num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0 && num5 == 0) {
            return 0;
        }

        // recursive case: add the first number to the sum of the remaining numbers
        return num1 + calculateSum(num2, num3, num4, num5, 0);
    }
}

