package SOLID_Principles.LSP.Violation;

public class Crow extends BirdLSP {
    @Override
    public void makeSound() {
        System.out.println("kaao kaao");
    }

    @Override
    public void fly() {
        System.out.println("crow flies");
    }
}
