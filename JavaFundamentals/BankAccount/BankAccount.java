public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts = 0;
    private static double totalMoney = 0; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalMoney += checkingBalance + savingsBalance;
        accounts += 2;
    }
    
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public static int getTotalAccounts(){
        return accounts;
    }

    public static double getTotalMoney(){
        return totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account

    public double depositChecking(double amount){
        this.checkingBalance += amount;
        totalMoney += amount;
        return this.checkingBalance;
    }

    public double depositSavings(double amount){
        this.savingsBalance += amount;
        totalMoney += amount;
        return this.savingsBalance;
    }
    
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney

    public double withdrawChecking(double amount){
        this.checkingBalance -= amount;
        totalMoney -= amount;
        return this.checkingBalance;
    }

    public double withdrawSavings(double amount){
        this.savingsBalance -= amount;
        totalMoney -= amount;
        return this.savingsBalance;
    }

    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public double getTotalBalance(){
        return this.checkingBalance + this.savingsBalance;
    }
}
