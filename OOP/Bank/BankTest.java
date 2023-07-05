public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        acc1.depositChecking(500);
        acc2.depositSavings(450);
        acc3.depositChecking(5000);

        System.out.println("Post Deposit Total Check: " + BankAccount.getTotalMoney());

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        System.out.println(acc1.getCheckingBalance()); //the current checking balance of acc1 is 1000 due to our deposit
        System.out.println(acc1.withdrawChecking(1001)); //this will fail to change the balance as it is an invalid transation
        System.out.println(acc2.withdrawSavings(450)); //printing the withdrawals to see the proper return string
        System.out.println(acc3.withdrawChecking(4999));

        System.out.println("Post Withdrawal Total Check: " + BankAccount.getTotalMoney());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Total number of accounts: "+BankAccount.getAccounts());
        System.out.println("End Result Total: " + BankAccount.getTotalMoney());

        acc1.displayAccount();
        acc2.displayAccount();
        acc3.displayAccount();
    }
}
