import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

        float maxSoFar = 0;
        float minSoFar = 0;
        float interest = 0;
        float average = 0;
        float total = 0;
        float number;

        Scanner scnr = new Scanner(System.in);
        int count = 0;

        while (count < 5) {
            System.out.println("Enter a number ");
            number = scnr.nextFloat();
            total = number + total;
            average = total / 5;
            if (count == 0) {
                maxSoFar = number;
            }
            else if (number > maxSoFar) {
                maxSoFar = number;
            }

            if (count == 0) {
                minSoFar = number;
            }
            else if (number < minSoFar) {
                minSoFar = number;
            }

            interest = (float) (total * 1.2);
            count = count + 1;
        }

    System.out.println("The total of your 5 numbers is " + total);
    System.out.println("The average of your 5 numbers is " + average);
    System.out.println("The minimum of your numbers is " + minSoFar);
    System.out.println("The maximum of your numbers is " + maxSoFar);
    System.out.println("The total of your 5 numbers with 20 percent interest is " + interest);
    }

}


