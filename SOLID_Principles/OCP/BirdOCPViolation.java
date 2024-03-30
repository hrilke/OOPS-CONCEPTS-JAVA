package SOLID_Principles.OCP;

public class BirdOCPViolation {
    String name;

    String color;

    double weight;

    String sound;
/*
Below method violets OCP as this structure involves repeated code in order to add more bird types in make sound feature.
    This structure involves modification and is prone to errors
        1. It might cause error in existing code.
        2. Repeated coding is involved.
        3. Understanding the becomes difficult


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
