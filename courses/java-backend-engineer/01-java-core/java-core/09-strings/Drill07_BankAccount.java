public class Drill07_BankAccount {

    static class BankAccount {
        String owner;
        double balance;

        void deposit(double amount) {
            balance = balance + amount;
        }

        void withdraw(double amount) {
            balance = balance - amount;
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.owner = "Alice Johnson";
        account.balance = 100.00;

        System.out.println("Owner: " + account.owner);
        System.out.println("Starting balance: $" + account.balance);

        account.deposit(50.00);
        System.out.println("After deposit: $" + account.balance);

        account.withdraw(30.00);
        System.out.println("After withdrawal: $" + account.balance);
    }
}