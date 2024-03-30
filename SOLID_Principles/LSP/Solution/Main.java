package SOLID_Principles.LSP.Solution;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BirdLSP> birdList = List.of( new Pigeon(), new Sparrow(), new Crow(), new Penguin());

        for (BirdLSP bird : birdList) {
            bird.action();
        }
        /*
            The Penguin class will implement the Swimmable interface and the Crow, Sparrow and Pigeon classes will implement the Flyable interface.
            This way, we can ensure that the Penguin class does not have to implement the fly() method.
        */
    }
}
