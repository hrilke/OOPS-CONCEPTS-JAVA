package OOPs_Concepts.Inheritance;

public class Student extends User{
    double psp = 0.00;

    public Student(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    public void getinfo() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.email);
        System.out.println(this.psp);
    }
}
