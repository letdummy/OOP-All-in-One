package Actor;
import java.util.Scanner;

public class ActorDemo{
    public static void main(String[] args){
        Actor orang = new Actor();

        Scanner inputSalary = new Scanner(System.in);
        System.out.println("Enter Actor's New Salary: ");
        orang.setSalary(inputSalary.nextInt());
    }
}