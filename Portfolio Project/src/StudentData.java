import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;

class Student {
    private final String name;
    private final String address;
    private final double GPA;

    public Student(String name, String address, double GPA) {
        this.name = name;
        this.address = address;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getGPA() {
        return GPA;
    }
}

public class StudentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Student> students = new LinkedList<Student>();

        // Loop to prompt for student data
        while (true) {
            System.out.println("Enter student name (or 'q' to quit): ");
            String name = scanner.nextLine();
            if (name.equals("q")) {
                break;
            }
            System.out.println("Enter student address: ");
            String address = scanner.nextLine();
            System.out.println("Enter student GPA: ");
            String gpa = scanner.nextLine();
            double gpaDouble = 0;
            try {
                gpaDouble = Double.parseDouble(gpa);
                if(gpaDouble < 0.0 || gpaDouble > 4.0) {
                    System.out.println("Invalid input, valid range 0.0 - 4.0 ");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
                continue;
            }
            students.add(new Student(name, address, gpaDouble));
        }

        // Sort the list of students by name
        students.sort(Comparator.comparing(Student::getName));

        // Write the list of students to a text file
        try {
            PrintWriter writer = new PrintWriter("students.txt", StandardCharsets.UTF_8);
            for (Student student : students) {
                writer.println(student.getName() + ", " + student.getAddress() + ", " + student.getGPA());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}

