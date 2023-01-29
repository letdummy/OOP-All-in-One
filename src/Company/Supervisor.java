package Company;

public class Supervisor extends PermanentEmployee{
    public int getWages(int totalOvertime, int totalStaff){
        int finalWages = basicSalary + (totalOvertime * 40_000) + (totalStaff * 60_000);
        return finalWages;
    }
}
