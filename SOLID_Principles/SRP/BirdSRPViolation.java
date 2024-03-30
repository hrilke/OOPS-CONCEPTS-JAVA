package SOLID_Principles.SRP;

public class BirdSRPViolation {
    String name;

    String color;

    double weight;

    String sound;

    /*
    Below method violets SRP as it has multiple if/else statements
    having multiple responsibilities and this is not a part of business logic.

    In case of multiple if else statements
        1. Understanding the code will be difficulty
        2. Repeatable code written
        3. Difficulty in testing
    */
    public void makeSound() {
        if (this.name == "crow") {
            System.out.println("kaao kaao");
        }
        else if (this.name == "sparrow") {
            System.out.println("chiw chiw");

        } else  {
           System.out.println("No such bird exists");
        }
    }

}
