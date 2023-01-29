package module_08;

public class Overloading {
    String userName, position = "manager";
    int userId = 200214197;

    public Overloading(){
        System.out.println("Class successfully created");
    }

    public Overloading(String userName){
        this();
        this.userName = userName;

        System.out.println("\n fetching data for " + userName + ".....\n");
        System.out.println("User Name: " + this.userName);
        System.out.println("User Id: " + this.userId);
        System.out.println("Position: " + this.position);
    }
}




