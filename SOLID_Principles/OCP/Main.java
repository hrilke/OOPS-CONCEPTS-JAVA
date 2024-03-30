package SOLID_Principles.OCP;

public class Main {
    public static void main(String[] args) {
        BirdOCP crow = new Crow();
        BirdOCP pigeon = new Pigeon();
        BirdOCP sparrow = new Sparrow();
        BirdOCP peacock = new Peacock();

        crow.makeSound();
        sparrow.makeSound();
        pigeon.makeSound();
        peacock.makeSound();
    }
}
