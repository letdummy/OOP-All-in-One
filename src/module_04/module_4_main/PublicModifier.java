package module_04.module_4_main;

public class PublicModifier {
    double a = 5;
    double b = 4;
    double c;

    public void add(){
        c = a + b;
        System.out.println("The result of the sum is: " + c);
    }

    public void subtract(){
        c = a - b;
        System.out.println("The result of the subtract is: " + c);
    }

    public void divide(){
        c = a / b;
        System.out.println("The result of the divide is: " + c);
    }

    public void average(){
        c = (a+b)/2;
        System.out.println("The average is: " + c);
    }


    public void printInfo(){
        System.out.println("This is PublicModifier");
    }

    public void sendMessage(){
        System.out.println("This is a message");
    }

}
