package SOLID_Principles.LSP.Solution;

public class Sparrow extends BirdLSP implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("chiu chiu");
    }

    @Override
    public void fly() {
        System.out.println("sparrow flies");
    }

    @Override
    public void action() {
        this.fly();
    }
}
