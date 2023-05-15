import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Bank {
    private List<Customer> customerList;

    public Bank() {
        customerList = new ArrayList<>();
    }

    public void readCustomerList(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        Customer current = new Customer();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.charAt(0) < '0' || line.charAt(0) > '9') {
                int numberIndex = 0;
                for (int i = 0; i < line.length(); ++i) {
                    if (line.charAt(i) >= '0' && line.charAt(i) <= '9') {
                        numberIndex = i;
                        break;
                    }
                }
                String fullName = line.substring(0, numberIndex - 1);
                long id = Long.parseLong(line.substring(numberIndex, line.length()));
                current = new Customer(id, fullName);
                customerList.add(current);
            } else {
                Scanner scanner1 = new Scanner(line).useLocale(Locale.US);
                long accountNumber = scanner1.nextLong();
                String type = scanner1.next();
                double balance = scanner1.nextDouble();
                if (type.equals(Account.CHECKING)) {
                    current.addAccount(new CheckingAccount(accountNumber, balance));
                } else if (type.equals(Account.SAVINGS)) {
                    current.addAccount(new SavingsAccount(accountNumber, balance));
                }
            }
        }
    }

    /**
     * Sort by name.
     * @return
     */
    public String getCustomersInfoByNameOrder() {
        List<Customer> customerNameOrder = new ArrayList<>();
        customerNameOrder.addAll(customerList);
        customerNameOrder.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < customerNameOrder.size(); ++i) {
            stringBuilder.append(customerNameOrder.get(i).getCustomerInfo());
            if (i < customerNameOrder.size() - 1) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Sort by id.
     * @return
     */
    public String getCustomersInfoByIdOrder() {
        List<Customer> customerNameOrder = new ArrayList<>();
        customerNameOrder.addAll(customerList);
        customerNameOrder.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getIdNumber() > o2.getIdNumber()) {
                    return 1;
                }
                if (o1.getIdNumber() < o2.getIdNumber()) {
                    return -1;
                }
                return 0;
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < customerNameOrder.size(); ++i) {
            stringBuilder.append(customerNameOrder.get(i).getCustomerInfo());
            if (i < customerNameOrder.size() - 1) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Getter.
     * @return
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }
}
