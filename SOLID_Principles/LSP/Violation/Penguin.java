package SOLID_Principles.LSP.Violation;

public class Penguin extends BirdLSP{
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
        throw new FlyableException("Penguins do not fly they swim");
    }

}
