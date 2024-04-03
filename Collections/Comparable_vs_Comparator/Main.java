package Collections.Comparable_vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("jordan", 90, 88, 66));
        students.add(new Student("john", 100, 90, 76));
        students.add(new Student("jonathan", 95, 81, 56));

        Collections.sort(students, new StudentPspComparator());
        System.out.println("Based on decreasing PSP");
        for (Student student : students) {
            System.out.println(student.name + " " +student.psp);
        }

        Collections.sort(students, new StudentAttendanceComparator());
        System.out.println("Based on increasing Attendance");
        for (Student student : students) {
            System.out.println(student.name +" "+student.attendance);
        }
    }
}
