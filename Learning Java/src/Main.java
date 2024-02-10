import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> dayTemps = new ArrayList<>();
        ArrayList<String> dayNames = new ArrayList<>();

        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        dayNames.add("Sunday");


        dayTemps.add(75); //temps for the week
        dayTemps.add(80);
        dayTemps.add(77);
        dayTemps.add(73);
        dayTemps.add(83);
        dayTemps.add(81);
        dayTemps.add(79);

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the week day: ");
        String wkDay = scn.nextLine();
        scn.close(); //It is important to close the resources we use, preventing leak

        int indexOfWeekDay = dayNames.indexOf(wkDay); //get the in index of the day
        if(indexOfWeekDay != -1){ //if the name cannot be found, -1 is returned
            //User asked us about specific weekday:
            System.out.print("The temperature for " + dayNames.get(indexOfWeekDay) +" is " + dayTemps.get(indexOfWeekDay) + " degrees.");
        }else if(wkDay.equals("week")){
            //User asked us about average:
            //Only bother calculating average if asked ;)
            float averageTemp = 0; // I would recommend float for percision
            for (Integer dayTemp : dayTemps) { //This is called an enchanted for loop. I suggest looking it up ;)
                averageTemp += dayTemp;
            }
            averageTemp /= dayTemps.size();
            System.out.print("The average temperature for the week is " + averageTemp + " degrees.");
        }else{
            //We can't recognise the entry
            System.out.println("Wrong entry: " + wkDay);
        }
    }
}