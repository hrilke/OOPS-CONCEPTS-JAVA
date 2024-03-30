package SOLID_Principles.OCP;

public class Peacock extends BirdOCP{
    @Override
    public void makeSound() {
        System.out.println("pieoo pieoo");
    }
    /*
    This structure of code enabled adding new requirement without any modification in the existing codebase.
    We can add multiple bird sound implementation like this.
    */
}
