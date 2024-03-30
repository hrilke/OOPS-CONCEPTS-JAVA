package SOLID_Principles.OCP;

public class Crow extends BirdOCP {
    @Override
    public void makeSound() {
        System.out.println("kaao kaao");
    }
}
