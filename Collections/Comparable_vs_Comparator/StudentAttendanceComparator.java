package Collections.Comparable_vs_Comparator;

import java.util.Comparator;

public class StudentAttendanceComparator  implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.attendance == student2.attendance) return 0;
        if (student1.attendance > student2.attendance) return 1;
        return -1;
    }

}
