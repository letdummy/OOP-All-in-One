package Company;

public class Staff extends PermanentEmployee{
    public int getWages(int totalOvertime){
        int finalWages = basicSalary + (totalOvertime * 30_000);
        return finalWages;
    }
}
