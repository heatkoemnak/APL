
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private int account_no;
    private String name;
    double balance;
    private String password;

    public Account(int account_no, String name, double balance, String password) { //constructor
        this.account_no = account_no; 
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public int getAccountNo() {
        return account_no;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void transfer(Account recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Transfer successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class ATM {
    private static Map<Integer, Account> accounts;

    public static void main(String[] args) {
        accounts = new HashMap<>();
        accounts.put(1, new Account(001, "Sopheak", 5000.00, "1234"));
        accounts.put(2, new Account(002, "Many", 2500.00, "5678"));
        accounts.put(3, new Account(003, "Kimnak", 1000.00, "9012"));
        accounts.put(4, new Account(004, "Khive", 750.00, "3456"));
        accounts.put(5, new Account(005, "Meisme", 10000.00, "7890"));

        Scanner scanner = new Scanner(System.in);

        int account_no;
        String password;

        do {
            System.out.print("Enter account number: ");
            account_no = scanner.nextInt();
            System.out.print("Enter password: ");
            password = scanner.next();
        } while (!authentication(account_no, password));

        Account account = accounts.get(account_no);

        char choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("a. Balance");
            System.out.println("b. Withdraw");
            System.out.println("c. Deposit");
            System.out.println("d. Transfer");
            System.out.println("e. Exit");

            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 'b':
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 'c':
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 'd':
                    System.out.print("Enter recipient account number: ");
                    int recipientAccountNo = scanner.nextInt();
                    Account recipient = accounts.get(recipientAccountNo);
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    account.transfer(recipient, transferAmount);
                    break;
                case 'e':
                    System.out.println("Thank you for using our simple ATM account");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'e');

        scanner.close();
    }

    private static boolean authentication(int account_no, String password) {
        Account account = accounts.get(account_no);

        if (account == null || !account.verifyPassword(password)) {
            System.out.println("Login failed. Please try again.");
            return false;
        }

        return true;
    }
}
