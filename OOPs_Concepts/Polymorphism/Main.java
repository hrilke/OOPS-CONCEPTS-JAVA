package OOPs_Concepts.Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("METHOD OVERLOADING");
        OverloadCompileTime PCMStudent = new OverloadCompileTime();
        PCMStudent.averageMarks(65,60,75);
        System.out.println("X---------------------X");

        OverloadCompileTime PCMBStudent = new OverloadCompileTime();
        PCMBStudent.averageMarks(65,60,75,95);
        System.out.println("X---------------------X");

        OverloadCompileTime BiFocalStudent = new OverloadCompileTime();
        BiFocalStudent.averageMarks(93,96,94,60,62);
        System.out.println("X---------------------X");


        System.out.println("METHOD OVERLOADING");
        AnimalOverrideExample dog = new DogOverrideRuntime();
        dog.makeSound();

        DogOverrideRuntime doggy = new DogOverrideRuntime();
        doggy.run();


    }
}
