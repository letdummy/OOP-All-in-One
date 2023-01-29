package module_08;

public class CustomerData {
    String name, address, occupation;
    int dob; //stand for date of birth
    double salary;

    public CustomerData(){
        System.out.println("Customer Data successfully created");
    }
    public CustomerData(String name, String address, String occupation, int dob, double salary){
        this.name = name;
        this.address = address;
        this.occupation = occupation;
        this.dob = dob;
        this.salary = salary;
        showData();
    }
    public void showData(){
        System.out.println("\n==============================");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Occupation: " + occupation);
        System.out.println("Date of birth: " + dob);
        System.out.println("Salary: $" + salary);
    }

}
