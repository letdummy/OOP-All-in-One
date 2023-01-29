package module_08;

import java.util.Scanner;

public class TestPolymorphism {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Scanner catName = new Scanner(System.in);
        System.out.println("Input name for CAT: ");
        cat.setName(catName.nextLine());

        Scanner dogName = new Scanner(System.in);
        System.out.println("Input name for DOG: ");
        dog.setName(dogName.nextLine());

        Scanner userInput = new Scanner(System.in);
        System.out.println(cat.callName() + " for cat, " + dog.callName() + " for dog");
        System.out.println("Choose your pet: ");

        String userPet = userInput.nextLine();
        System.out.println();
        if (userPet.equals(cat.callName())){
            cat.showInfo();
        } else if (userPet.equals(dog.callName())) {
            dog.showInfo();
        } else {
            System.out.println("invalid Input, retry");

        }
    }
}





