package Library;

public class Car{
    String brand = "Mitsubishi";
    static int wheel = 4;
    static final String power = "150 HP";

    private String test = "test";

    public Car(){
        System.out.println("You have successfully created an object");
    }

    String getBrand(){
        return this.brand;
    }

    int getWheel(){
        return Car.wheel;
    }

    String getPower(){
        return Car.power;
    }
}