import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] list = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            list[i] = scanner.nextInt();
        }

        System.out.print("Enter the integer to find: ");
        int target = scanner.nextInt();

        int position = binarySearch(list, target);
        if (position == -1) {
            System.out.println(target + " was not found in the list.");
        } else {
            System.out.println(target + " was found at position " + (position + 1));
        }

        scanner.close();
    }

    public static int binarySearch(int[] list, int target) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (list[mid] == target) {
                return mid;
            } else if (list[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}



