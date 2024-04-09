package Design_Patterns.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection  dbconn = DatabaseConnection.getInstance();
        System.out.println(dbconn);
        DatabaseConnection  dbconn1 = DatabaseConnection.getInstance();
        System.out.println(dbconn1);
        DatabaseConnection  dbconn2 = DatabaseConnection.getInstance();
        System.out.println(dbconn2);
        DatabaseConnection  dbconn3 = DatabaseConnection.getInstance();
        System.out.println(dbconn3);

        // Observe the hashcode being printed for the above objects. It is referring to the same single object.
    }
}
