package OOPs_Concepts;

public class Car {
    public static double PI = 3.14;
    private int registrationNumber;
    protected String name;
    public String manufacturer;


    public void carInfo(){
        System.out.print(this.registrationNumber+" "+this.name+ " "+ this.manufacturer);
    }
    public void startEngine(){
        System.out.print("Engine Started");
    }
}
