import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of arrays you want to create: ");
        int numArrays = scanner.nextInt();

        for (int i = 1; i <= numArrays; i++) {
            System.out.println("\nArray #" + i);

            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter the elements of the array:");

            for (int j = 0; j < size; j++) {
                arr[j] = scanner.nextInt();
            }

            System.out.print("Do you want to use a sorting algorithm on this array? (Y/N): ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("Y")) {
                sortArray(arr);
                System.out.println("Array sorted successfully.");
            } else {
                System.out.println("Array not sorted.");
            }

            // Check if the array is sorted correctly
            boolean isSorted = ArraySortChecker.isSorted(arr);

            if (isSorted) {
                System.out.println("Array is sorted correctly.");
            } else {
                System.out.println("Array is not sorted correctly.");
            }

            System.out.println("Array: " + Arrays.toString(arr));
        }

        scanner.close();
    }

    public static void sortArray(int[] arr) {
        // Implementation of the sorting algorithm
        // ...

        // Assume sorting the array in ascending order
        Arrays.sort(arr);
    }
}

class ArraySortChecker {
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

