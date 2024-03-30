package SOLID_Principles.LSP.Violation;

public class Pigeon extends BirdLSP {
    @Override
    public void makeSound() {
        System.out.println("Gutter goo");
    }

    @Override
    public void fly() {
        System.out.println("pigeon flies");
    }
}
