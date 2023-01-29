package Company;

public class ContractEmployee extends Employee{
    public int getWages(int attendance){
        int finalWages = dailyWages * attendance;
        return finalWages;
    }
}
