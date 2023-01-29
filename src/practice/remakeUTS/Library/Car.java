package practice.remakeUTS.Library;

public class Car {
    String brand = "Toyota"; //an instance variable
    static int wheel = 4; //a static variable
    static final String power = "1500 CC"; //a static constant variable (ada finalnya)

    public Car(){ //default constructor
        System.out.println("You have successfully created an object");
    }

    String getBrand(){ //non-void method
        return brand;
    }

    String getPower(){
        return power;
    }

    int getWheel(){
       return wheel;
    }
}






