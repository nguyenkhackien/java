public class Account {
    private double balance;
    private java.util.ArrayList<Transaction> transitionList
            = new java.util.ArrayList<Transaction>();

    /**
     * nap tien.
     *
     * @param amount so tien nap
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            this.balance = this.balance + amount;
            Transaction transaction = new Transaction("deposit", amount, this.balance);
            transitionList.add(transaction);
        }
    }

    /**
     * rut tien.
     *
     * @param amount so tien rut
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else {
            if (amount > this.balance) {
                System.out.println("So tien ban rut vuot qua so du!");
            } else {
                this.balance = this.balance - amount;
                Transaction transaction = new Transaction("withdraw", amount, this.balance);
                transitionList.add(transaction);
            }
        }
    }

    /**
     * them giao dich.
     *
     * @param amount    so tien giao dich
     * @param operation hoat dong
     */
    public void addTransaction(double amount, String operation) {
        if (!(operation.equals(Transaction.DEPOSIT) || operation.equals(Transaction.WITHDRAW))) {
            System.out.println("Yeu cau khong hop le!");
        } else {
            if (operation.equals(Transaction.DEPOSIT)) {
                this.deposit(amount);
            } else {
                this.withdraw(amount);
            }
        }
    }

    /**
     * in lich su giao dich.
     */
    public void printTransaction() {
        int count = 1;
        for (Transaction i : transitionList) {
            if (i.getOperation().equals("deposit")) {
                System.out.format("Giao dich %d: Nap tien $%.2f. So du luc nay: $%.2f.\n",
                        count, i.getAmount(), i.getBalance());
                count += 1;
            } else {
                System.out.format("Giao dich %d: Rut tien $%.2f. So du luc nay: $%.2f.\n",
                        count, i.getAmount(), i.getBalance());
                count += 1;
            }
        }
    }
}
