package assignment_01;
import java.util.Scanner;
public class Assignment {
    String name, address = "Solo, Central Java, Indonesia", studentId = "L200214197";
    int age = 21;
    public Assignment(){
        Scanner input = new Scanner(System.in);
        System.out.println("Find student name: ");
        this.name = input.nextLine();
        showProfile();
    }
    public void showProfile(){
        System.out.println("=========== Student's Info ===========");
        System.out.println("Name: " + this.name + "\n" +
                            "Address: " + this.address + "\n" +
                            "ID: " + this.studentId + "\n" +
                            "Age: " + this.age);
    }
}



