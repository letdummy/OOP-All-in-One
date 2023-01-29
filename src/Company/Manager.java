package Company;

public class Manager extends PermanentEmployee{
    public int getWages(int totalOvertime, int totalProject, int totalSupervisor, int totalStaff){
        int finalWages = basicSalary + (totalOvertime * 50_000) + (totalProject * 1_000_000) +
                                       (totalSupervisor * 100_000) + (totalStaff * 60_000);
        return finalWages;
    }
}
