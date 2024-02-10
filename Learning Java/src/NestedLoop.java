import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int i;
        int j = 0;

        System.out.print("Enter a number to count to: ");
        userNum = scnr.nextInt();

        while (j < userNum + 1) {

            for (i = 0; i < j; ++i) {
                System.out.print(" ");
            }

            System.out.println(j);
            j = j + 1;

        }

    }

}
