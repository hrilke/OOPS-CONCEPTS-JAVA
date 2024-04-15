package OOPs_Concepts.Inheritance;

public class User{
    int id;
    String name;
    String email;
    String password;

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void changePassword() {
        System.out.println("Password Changed");
    }
}
