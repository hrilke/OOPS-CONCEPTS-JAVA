package SOLID_Principles.LSP.Solution;

public class Pigeon extends BirdLSP implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("Gutter goo");
    }

    @Override
    public void fly() {
        System.out.println("pigeon flies");
    }

    @Override
    public void action() {
        this.fly();
    }
}
