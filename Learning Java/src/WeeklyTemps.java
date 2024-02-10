import java.util.Objects;
import java.util.Scanner;

public class WeeklyTemps {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        float[] monthlyTemp = new float[12];
        String[] month = new String[12];
        String currMonth;

        month[0] = "January";
        month[1] = "February";
        month[2] = "March";
        month[3] = "April";
        month[4] = "May";
        month[5] = "June";
        month[6] = "July";
        month[7] = "August";
        month[8] = "September";
        month[9] = "October";
        month[10] = "November";
        month[11] = "December";


        monthlyTemp[0] = 20;
        monthlyTemp[1] = 35;
        monthlyTemp[2] = 44;
        monthlyTemp[3] = 47;
        monthlyTemp[4] = 59;
        monthlyTemp[5] = 64;
        monthlyTemp[6] = 75;
        monthlyTemp[7] = 81;
        monthlyTemp[8] = 65;
        monthlyTemp[9] = 55;
        monthlyTemp[10] = 38;
        monthlyTemp[11] = 29;

        float total = 0;
        int i;
        int j;

        for (i = 0; i < monthlyTemp.length; i++) {
            total = monthlyTemp[i] + total;
        }

        float average = total / monthlyTemp.length;

        System.out.print("What month of the year would you like to know the average temperature? ");
        currMonth = scnr.next();
        if (Objects.equals(currMonth, "January")) {
            System.out.print(currMonth + " was " + monthlyTemp[0]);

        } else if (Objects.equals(currMonth, "February")) {
            System.out.print("The average temperature during " + currMonth + " was " + monthlyTemp[1] + " degrees fahrenheit.");

        } else if (Objects.equals(currMonth, "March")) {
            System.out.print("The average temperature during " + currMonth + " was " + monthlyTemp[2] + " degrees fahrenheit.");

        } else if (Objects.equals(currMonth, "April")) {
            System.out.print("The average temperature during " + currMonth + " was " + monthlyTemp[3] + " degrees fahrenheit.");

        } else if (Objects.equals(currMonth, "May")) {
            System.out.print("The average temperature during " + currMonth + " was " + monthlyTemp[4] + " degrees fahrenheit.");

        } else if (Objects.equals(currMonth, "June")) {
            System.out.print("The average temperature during " + currMonth + " was " + monthlyTemp[5] + " degrees fahrenheit.");

        } else if (Objects.equals(currMonth, "July")) {
            System.out.print("The average temperature during " + currMonth + " was " + monthlyTemp[6] + " degrees fahrenheit.");

        } else if (Objects.equals(currMonth, "August")) {
            System.out.print("The average temperature during " + currMonth + " was " + monthlyTemp[7] + " degrees fahrenheit.");

        } else if (Objects.equals(currMonth, "September")) {
            System.out.print("The average temperature during " + currMonth + " was " + monthlyTemp[8] + " degrees fahrenheit.");

        } else if (Objects.equals(currMonth, "October")) {
            System.out.print("The average temperature during " + currMonth + " was " + monthlyTemp[9] + " degrees fahrenheit.");

        } else if (Objects.equals(currMonth, "November")) {
            System.out.print("The average temperature during " + currMonth + " was " + monthlyTemp[10] + " degrees fahrenheit.");

        } else if (Objects.equals(currMonth, "December")) {
            System.out.print("The average temperature during " + currMonth + " was " + monthlyTemp[11] + " degrees fahrenheit.");


        } else if (Objects.equals(currMonth, "year")) {
            System.out.println("The average temperature of the year was " + average + " degrees fahrenheit.");
            System.out.println("The average temperature for each month was: ");
            for (j = 0; j < monthlyTemp.length; j++) {
                System.out.println(month[j] + ": " + monthlyTemp[j] + " degrees fahrenheit");
            }
            int count = 0;
            double maxSoFar = 0.0;
            double minSoFar = 0.0;
            String minMonth = "";
            String maxMonth = "";

            while (count < month.length) {
                if (count == 0) {
                    maxSoFar = monthlyTemp[count];
                    maxMonth = month[count];

                } else if (monthlyTemp[count] > maxSoFar) {
                    maxSoFar = Double.parseDouble(String.valueOf(monthlyTemp[count]));
                    maxMonth = month[count];
                }

                if (count == 0) {
                    minSoFar = monthlyTemp[count];
                    minMonth = month[count];

                } else if (monthlyTemp[count] < minSoFar) {
                    minSoFar = monthlyTemp[count];
                    minMonth = month[count];
                }
                count = count + 1;
            }
            System.out.println("The maximum average temperature of the year was " + maxSoFar + " degrees fahrenheit" + " in " + maxMonth + ".");
            System.out.println("The minimum average temperature of the year was " + minSoFar + " degrees fahrenheit" + " in " + minMonth + ".");
        }

    }

}
