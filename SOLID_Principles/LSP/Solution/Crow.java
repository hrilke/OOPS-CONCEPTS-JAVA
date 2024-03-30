package SOLID_Principles.LSP.Solution;

public class Crow extends BirdLSP implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("kaao kaao");
    }

    @Override
    public void fly() {
        System.out.println("crow flies");
    }

    @Override
    public void action() {
        this.fly();
    }
}
