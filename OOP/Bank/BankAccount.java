public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    public BankAccount(){
        this.checkingBalance=500;
        this.savingsBalance=2500;
        accounts++;
        totalMoney+=(this.checkingBalance + this.savingsBalance);
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public static int getAccounts(){
        return accounts;
    }

    public static double getTotalMoney(){
        return totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void depositChecking(double deposit){
        this.checkingBalance+=deposit;
        totalMoney+=deposit;
    }

    public void depositSavings(double deposit){
        this.savingsBalance+=deposit;
        totalMoney+=deposit;
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    public String withdrawChecking(double withdrawal){
        if(this.checkingBalance-withdrawal >= 0){
            this.checkingBalance-=withdrawal;
            totalMoney-=withdrawal;
            return "Withdrawal successful.";
        }
        else return "Insufficient Funds.";
    }

    public String withdrawSavings(double withdrawal){
        if(this.savingsBalance-withdrawal >= 0){
            this.savingsBalance-=withdrawal;
            totalMoney-=withdrawal;
            return "Withdrawal successful.";
        }
        else return "Insufficient Funds.";
    }

    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void displayAccount(){
        System.out.println("--This Account--");
        System.out.println("Checking: " + this.checkingBalance);
        System.out.println("Savings: " + this.savingsBalance);
    }
}
