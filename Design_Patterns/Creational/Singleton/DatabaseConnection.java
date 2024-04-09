package Design_Patterns.Creational.Singleton;

public class DatabaseConnection {
    // Step 2 : Hold single instance of the class by making it class level
    //          using static and making it private.
    private static DatabaseConnection instance;

    // Step 1 : Prevention of Instantiation of Object from outside
    //          By making the constructor private.
    private DatabaseConnection(){}

    // Step 3 : Implementing class level method to return single instance of class.
    //          Making the method thread safe by using Synchronized and Double-Checked locking.
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class){
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

}
