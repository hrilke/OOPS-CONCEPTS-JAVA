package Collections.Comparable_vs_Comparator;

import java.util.Comparator;

public class StudentPspComparator  implements Comparator<Student> {


    @Override
    public int compare(Student student1, Student student2) {

        if (student1.psp == student2.psp) return 0;
        if (student1.psp < student2.psp) return 1;
        return -1;

    }

}
