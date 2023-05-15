import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList;

    /**
     * Constructor.
     */
    public Customer() {
        accountList = new ArrayList<>();
    }

    /**
     * Constructor.
     */
    public Customer(long idNumber, String fullName) {
        this();
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * Getter.
     */
    public String getCustomerInfo() {
        String ret = String.format("Số CMND: %d. Họ tên: %s.", idNumber, fullName);
        return ret;
    }

    /**
     * Add new account.
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * Remove account.
     */
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    /**
     * Getter.
     * @return
     */
    public List<Account> getAccountList() {
        return accountList;
    }

    /**
     * Setter.
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Getter.
     * @return
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * Setter.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Getter.
     * @return
     */
    public String getFullName() {
        return fullName;
    }
}
