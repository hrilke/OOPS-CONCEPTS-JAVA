package SOLID_Principles.OCP;

public class Pigeon extends BirdOCP {
    @Override
    public void makeSound() {
        System.out.println("Gutter goo");
    }
}
