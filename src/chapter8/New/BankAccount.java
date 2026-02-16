package chapter8.New;

public class BankAccount {
    private double balance;
    
    public BankAccount() {
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        balance += money;
        System.out.println("Deposit " + money + " Success");
    }

    public void withdraw(double money) {
        if (money <= balance) {
            balance -= money;
            System.out.println("Withdraw " + money + " Success");
        } else System.out.println("Withdraw Error " + money + " Unsuccess");
    }

    public String toString() {
        return "Balance : " + balance;
    }


}
