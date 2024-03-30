package SOLID_Principles.SRP;

public class Main {
    public static void main(String[] args) {
        BirdSRP crow = new Crow();
        BirdSRP pigeon = new Pigeon();
        BirdSRP sparrow = new Sparrow();

        crow.makeSound();
        sparrow.makeSound();
        pigeon.makeSound();
    }
}
