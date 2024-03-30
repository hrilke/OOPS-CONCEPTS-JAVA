package SOLID_Principles.LSP.Violation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BirdLSP> birdList = List.of( new Pigeon(), new Sparrow(), new Crow(), new Penguin());

        for (BirdLSP bird : birdList) {
            bird.fly();
        }
        /*
            If we have a Bird object, we should be able to replace it with an instance of its subclasses without altering the correctness of the program.
            In our case, we cannot replace a Bird object with a Penguin object because the Penguin object requires special handling.
        */
    }
}
