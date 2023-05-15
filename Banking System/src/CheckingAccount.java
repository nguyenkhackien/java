public class CheckingAccount extends Account {

    /**
     * Constructor.
     */
    public CheckingAccount(long accountNumber, double amount) {
        super(accountNumber, amount);
    }

    /**
     * Withdraw.
     */
    @Override
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);
            addTransaction(new Transaction(
                    Transaction.TYPE_WITHDRAW_CHECKING, balance + amount,
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
                    Transaction.TYPE_DEPOSIT_CHECKING, balance - amount,
                    amount, balance)
            );
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}
