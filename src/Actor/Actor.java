package Actor;

public class Actor {
    private String name = "Agus Ardiansyah Nh";
    private int salary = 1_000_000_000; //underscore for easy read (basic separation)

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int newSalary){
        this.salary = newSalary;
    }
}
