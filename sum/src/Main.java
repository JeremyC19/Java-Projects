import java.util.Scanner;

public class Main {
    public static int sum(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + sum(numbers, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number:");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int result = sum(numbers, 0);
        System.out.println("The sum of the numbers is: " + result);
    }
}

