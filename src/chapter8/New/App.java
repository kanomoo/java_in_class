package chapter8.New;

public class App {
    
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.deposit(500);
        bank.withdraw(400);
        System.out.println(bank);
    }
}
