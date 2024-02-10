import java.util.Scanner;

public class Phone {
        public static void main(String[] args) {
            String provider;
            String model;
            int minutes;
            int dataLimit;
            int minuteUsage;
            int dataUsage;
            int remainingMinutes;
            int remainingData;
            Scanner scnr = new Scanner(System.in);

            System.out.println("Who is your phone provider?");
            provider = scnr.next();
            System.out.println("What model is your phone?");
            model = scnr.next();
            System.out.println("How many minutes are on your plan?");
            minutes = scnr.nextInt();
            System.out.println("What is your plan's monthly data limit in MBs?");
            dataLimit = scnr.nextInt();
            System.out.println("What is your current minute usage?");
            minuteUsage = scnr.nextInt();
            System.out.println("What is your current data usage in MBs?");
            dataUsage = scnr.nextInt();

            remainingMinutes = (minutes - minuteUsage);
            remainingData = (dataLimit - dataUsage);
            
            System.out.println("Model: " + model);
            System.out.println("Phone provider: " + provider);
            System.out.println("Minutes Remaining: " + remainingMinutes);
            System.out.println("Data remaining : " + remainingData + " MBs");
        }
}
