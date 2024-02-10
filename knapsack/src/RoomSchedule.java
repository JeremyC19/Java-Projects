import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Activity {
    int startTime;
    int stopTime;

    public Activity(int startTime, int stopTime) {
        this.startTime = startTime;
        this.stopTime = stopTime;
    }
}

class Schedule {
    List<Activity> activities;

    public Schedule() {
        activities = new ArrayList<>();
    }

    public Schedule(List<Activity> activities) {
        this.activities = activities;
    }

    public int getUsage() {
        int usage = 0;
        for (Activity activity : activities) {
            usage += activity.stopTime - activity.startTime;
        }
        return usage;
    }
}

class RoomScheduler {
    public static Schedule maxRoomUse(int startTime, int stopTime, List<Activity> activities, int index) {
        // Base condition
        if (index >= activities.size() || startTime >= stopTime) {
            return new Schedule();
        }

        Activity current = activities.get(index);

        // If activity cannot be scheduled between startTime and stopTime, move on to the next activity
        if (current.startTime < startTime || current.stopTime > stopTime) {
            return maxRoomUse(startTime, stopTime, activities, index + 1);
        }

        // Ignore current activity
        Schedule s1 = maxRoomUse(startTime, stopTime, activities, index + 1);

        // Add current activity to the schedule
        Schedule s2 = maxRoomUse(current.stopTime, stopTime, activities, index + 1);
        s2.activities.add(0, current); // Add current activity at the beginning of the schedule

        // Compare and return the schedule with greater room usage
        return (s1.getUsage() > s2.getUsage()) ? s1 : s2;
    }
}

public class RoomSchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start time of the room: ");
        int startTime = scanner.nextInt();

        System.out.print("Enter the stop time of the room: ");
        int stopTime = scanner.nextInt();

        System.out.print("Enter the number of activities: ");
        int numActivities = scanner.nextInt();

        List<Activity> activities = new ArrayList<>();
        System.out.println("Enter the start and stop time for each activity:");
        for (int i = 0; i < numActivities; i++) {
            System.out.print("Activity " + (i + 1) + " - Start Time: ");
            int activityStartTime = scanner.nextInt();
            System.out.print("Activity " + (i + 1) + " - Stop Time: ");
            int activityStopTime = scanner.nextInt();
            activities.add(new Activity(activityStartTime, activityStopTime));
        }

        Schedule maxUsageSchedule = RoomScheduler.maxRoomUse(startTime, stopTime, activities, 0);

        System.out.println("\nActivities for maximum room usage:");
        for (Activity activity : maxUsageSchedule.activities) {
            System.out.println("Start Time: " + activity.startTime + ", Stop Time: " + activity.stopTime);
        }

        System.out.println("Maximum Room Usage: " + maxUsageSchedule.getUsage());
    }
}



