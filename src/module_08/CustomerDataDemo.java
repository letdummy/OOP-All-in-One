package module_08;

import java.util.Scanner;

public class CustomerDataDemo {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = inputName.nextLine();

        Scanner inputAddress = new Scanner(System.in);
        System.out.print("Enter your address: ");
        String address = inputAddress.nextLine();

        Scanner inputOccupation = new Scanner(System.in);
        System.out.print("Enter your occupation: ");
        String occupation = inputOccupation.nextLine();

        Scanner inputDob = new Scanner(System.in);
        System.out.print("Enter your date of birth: ");
        int dob = inputDob.nextInt();

        Scanner inputSalary = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = inputSalary.nextDouble();

        CustomerData customerData = new CustomerData(name, address, occupation, dob, salary);

        System.out.println("\ndo you want to random data for next 9 customers?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        Scanner inputChoice = new Scanner(System.in);
        int choice = inputChoice.nextInt();

        if (choice == 1) {
            CustomerData customerData2 = new CustomerData("Joko", "Malaysia", "Teacher", 1995, 500);
            CustomerData customerData3 = new CustomerData("Anwar", "Singapore", "Developer", 1996, 600);
            CustomerData customerData4 = new CustomerData("Sugeng", "Australia", "Driver", 1997, 700);
            CustomerData customerData5 = new CustomerData("Dalu", "Malaysia", "Professor", 1998, 800);
            CustomerData customerData6 = new CustomerData("Dedi", "Indonesia", "Developer", 1999, 900);
            CustomerData customerData7 = new CustomerData("Sumargo", "Indonesia", "Data Analyst", 2000, 910);
            CustomerData customerData8 = new CustomerData("Icha", "Malaysia", "Data Engineering", 2001, 920);
            CustomerData customerData9 = new CustomerData("Laras", "Malaysia", "Cyber Security", 2002, 970);
        } else if (choice == 2) {
            System.out.println("Please edit the data at source code");
            System.out.println("Thank you for using our program");
        } else {
            System.out.println("Invalid input");
        }
    }
}





