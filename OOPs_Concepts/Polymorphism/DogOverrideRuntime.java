package OOPs_Concepts.Polymorphism;

public class DogOverrideRuntime extends AnimalOverrideExample implements Runnable{
    @Override
    public void run() {
        System.out.println("This is method from DOG class overrides method inside Runnable Interface");
    }

    public void makeSound(){
        System.out.println("BHOW BHOW");
    }
}
