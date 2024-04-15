package OOPs_Concepts.Inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(123, "Hrishi", "hrishi@123", "encrypted");
        student.getinfo();
        student.changePassword();
        System.out.println("----------------------------------------");
        Teacher teacher = new Teacher(111, "teacher", "teacher@111", "encrypted", "abc");
        teacher.getinfo();
        teacher.changePassword();
    }
}
