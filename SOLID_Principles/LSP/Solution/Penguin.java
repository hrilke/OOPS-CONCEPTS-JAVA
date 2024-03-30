package SOLID_Principles.LSP.Solution;

import SOLID_Principles.LSP.Violation.FlyableException;

public class Penguin extends BirdLSP implements Swimmable{
    @Override
    public void makeSound() {

    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming now");

    }

    @Override
    public void action() {
        this.swim();
    }

}
