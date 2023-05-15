public class SavingsAccount extends Account{
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Withdraw.
     */
    @Override
    public void withdraw(double amount) {

        try {
            doWithdrawing(amount);
            addTransaction(new Transaction(
                    Transaction.TYPE_WITHDRAW_SAVINGS, balance + amount,
                    amount, balance)
            );
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Deposit.
     */
    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
            addTransaction(new Transaction(
                    Transaction.TYPE_DEPOSIT_SAVINGS, balance - amount,
                    amount, balance)
            );
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}
