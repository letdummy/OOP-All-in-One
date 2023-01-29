package practice.remakeUTS.Library;

import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args){
        Car mobil = new Car();

        Scanner inputBrand = new Scanner(System.in);   //assign value (a)
        System.out.println("Enter the car's brand: ");
        mobil.brand = inputBrand.nextLine();

        Scanner inputWheel = new Scanner(System.in);
        System.out.println("Enter the wheel's count: ");
        Car.wheel = inputWheel.nextInt();

        // final variable cannot be re-assigned

        System.out.println("The brand of this car is " + mobil.getBrand());
        System.out.println("This car have " + mobil.getPower() + " power");
        System.out.println("Also have " + mobil.getWheel() + " wheel");

        number2 test = new number2();

        test.test();
    }
}