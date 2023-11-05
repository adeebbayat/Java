public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount(100, 1000);
        BankAccount account2 = new BankAccount(2000, 10000);
        BankAccount account3 = new BankAccount(25000, 300000);

        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        System.out.println("New Checking Balance: $" + account1.depositChecking(200));
        System.out.println("New Savings Balance: $" + account2.depositSavings(5000));
        System.out.println("New Checking Balance: $" + account3.depositChecking(2500));

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        System.out.println("New Checking Balance: $" + account1.withdrawChecking(50));
        System.out.println("New Savings Balance: $" + account2.withdrawSavings(500));
        System.out.println("New Savings Balance: $" + account3.withdrawSavings(2000));
        

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Total Bank Accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Total Money: $" + BankAccount.getTotalMoney());
    }
}

