package OOPs_Concepts.Abstraction;

public class ICat  implements Animal{
    @Override
    public void makesound() {
        System.out.println("meow meow");
    }
}
