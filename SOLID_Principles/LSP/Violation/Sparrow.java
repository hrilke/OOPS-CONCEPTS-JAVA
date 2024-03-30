package SOLID_Principles.LSP.Violation;

public class Sparrow extends BirdLSP {
    @Override
    public void makeSound() {
        System.out.println("chiu chiu");
    }

    @Override
    public void fly() {
        System.out.println("sparrow flies");
    }
}
