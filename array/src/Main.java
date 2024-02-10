import java.util.*;

class Student {
    int rollno;
    String name;
    String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}

class SortByRollno implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getRollno() - b.getRollno();
    }
}

class SelectionSort {
    public void sort(ArrayList<Student> students, Comparator<Student> comparator) {
        for (int i = 0; i < students.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < students.size(); j++) {
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Student temp = students.get(i);
            students.set(i, students.get(minIndex));
            students.set(minIndex, temp);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jay", "New York"));
        students.add(new Student(2, "Adam", "Austin"));
        students.add(new Student(3, "Bebe", "Los Angeles"));
        students.add(new Student(4, "Evander", "San Francisco"));
        students.add(new Student(5, "Max", "Colorado Springs"));
        students.add(new Student(6, "Peter", "Denver"));
        students.add(new Student(7, "Trinity", "Los Angeles"));
        students.add(new Student(8, "Vanessa", "San Antonio"));
        students.add(new Student(9, "Waldo", "New Jersey"));
        students.add(new Student(10, "Cam", "Charlotte"));

        SelectionSort selectionSort = new SelectionSort();


        selectionSort.sort(students, new SortByName());
        System.out.println("Sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }


        selectionSort.sort(students, new SortByRollno());
        System.out.println("Sorted by roll number:");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}