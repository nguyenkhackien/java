import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList;

    /**
     * Constructor.
     */
    public Account() {
        transactionList = new ArrayList<>();
    }

    /**
     * Constructor.
     */
    public Account(long accountNumber, double balance) {
        this();
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Getter.
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Getter.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Withdraw.
     */
    public abstract void withdraw(double amount);

    /**
     * Deposit.
     */
    public abstract void deposit(double amount);

    /**
     * Checking valid.
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > balance) {
            throw new InsufficientFundsException(amount);
        } else {
            balance -= amount;
        }
    }

    /**
     * Checking valid.
     */
    public void doDepositing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            balance += amount;
        }
    }

    /**
     * Getter.
     */
    public String getTransactionHistory() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lịch sử giao dịch của tài khoản " + this.accountNumber + ":\n");
        for (int i = 0; i < transactionList.size(); ++i) {
            stringBuilder.append(transactionList.get(i).getTransactionSummary() + "\n");
        }
        return stringBuilder.toString();
    }

    /**
     * Add new transaction.
     */
    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    /**
     * Equals.
     */
    public boolean equals(Object o) {
        Account other = (Account) o;
        if (this.accountNumber == other.accountNumber) {
            return true;
        }
        return false;
    }
}

