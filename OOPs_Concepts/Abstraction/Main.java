package OOPs_Concepts.Abstraction;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makesound();

        ICat cat1 = new ICat();
        cat1.makesound();
    }
}
