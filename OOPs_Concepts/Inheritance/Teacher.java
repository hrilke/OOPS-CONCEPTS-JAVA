package OOPs_Concepts.Inheritance;

public class Teacher extends User{
    String companyName;

    public Teacher(int id, String name, String email, String password, String companyName) {
        super(id, name, email, password);
        this.companyName = companyName;
    }

    public void getinfo() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.email);
        System.out.println(this.companyName);
    }
}
