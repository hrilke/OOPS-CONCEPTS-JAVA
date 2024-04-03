package Collections.Comparable_vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("jordan", 90, 88, 66));
        students.add(new Student("john", 100, 90, 76));
        students.add(new Student("jonathan", 95, 81, 56));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.name);
        }


    }
}
