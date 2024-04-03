package Collections.Comparable_vs_Comparator;

public class Student implements Comparable<Student> {
    public int psp;
    public int attendance;
    public int readinessScore;

    public String name;

    public Student(String name, int psp, int attendance, int readinessScore) {
        this.name = name;
        this.psp = psp;
        this.attendance = attendance;
        this.readinessScore = readinessScore;
    }

    @Override
    public int compareTo(Student other) {
        if (this.name.length() == other.name.length()) return 0;
        if (this.name.length() > other.name.length()) return 1;
        return -1;
    }
}
