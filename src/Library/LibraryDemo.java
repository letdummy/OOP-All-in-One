package Library;

import java.util.Scanner;

public class LibraryDemo{
    public static void main(String[] args){
        Car mobil = new Car();

        Scanner inputBrand = new Scanner(System.in);
        System.out.println("Enter Car's Brand: ");
        mobil.brand = inputBrand.nextLine();

        Scanner inputWheel = new Scanner(System.in);
        System.out.println("Enter Car's Wheel: ");
        Car.wheel = inputWheel.nextInt();

        // static constant variable cannot be reassigned

        System.out.println("Your car's brand is: " + mobil.getBrand());
        System.out.println("Total wheel count: " + mobil.getWheel() + " Wheels");
        System.out.println("Engine power: " + mobil.getPower());
    }
}