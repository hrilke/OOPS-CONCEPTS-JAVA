package OOPs_Concepts;

public class Car {
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
