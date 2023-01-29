package module_08;

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        PrivateBank privateBank = new PrivateBank();
        PublicBank publicBank = new PublicBank();
        MarketBank marketBank = new MarketBank();
        SyariahBank syariahBank = new SyariahBank();

        System.out.println("Bank");
        bank.interestRate();
        System.out.println("\nPrivate Bank");
        privateBank.interestRate();
        System.out.println("\nPublic Bank");
        publicBank.interestRate();
        System.out.println("\nMarket Bank");
        marketBank.interestRate();
        System.out.println("\nSyariah Bank");
        syariahBank.interestRate();
    }
}



