import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter option:");
            System.out.println("a. Check Balance");
            System.out.println("b. Withdraw");
            System.out.println("c. Create Account");
            System.out.println("d. Transfer");
            System.out.println("e. Display All Accounts");            
            System.out.println("f. Generate Report ");
            System.out.println("g. Exit");

            String option = scanner.nextLine();
            switch (option) {
                case "a":
                    System.out.println("Enter Account Number:");
                    String accNum = scanner.nextLine();
                    for (BankAccount acc : accounts) {
                        if (acc.getAccountNumber().equals(accNum)) {
                            System.out.println("Balance: " + acc.getBalance());
                            
                        }



                        
                    }
                    break;

                case "b":
                    System.out.println("Enter Account Number:");
                    accNum = scanner.nextLine();
                    for (BankAccount acc : accounts) {
                        if (acc.getAccountNumber().equals(accNum)) {
                            System.out.println("Enter Amount to Withdraw:");
                            double amount = Double.parseDouble(scanner.nextLine());
                            if (amount > acc.getBalance()) {
                                System.out.println("Insufficient Balance!");
                                break;
                            }
                            acc.setBalance(acc.getBalance() - amount);
                            System.out.println("Withdrawal Successful!");
                            break;
                        }
                    }
                    break;

                case "c":
                    System.out.println("Enter Account Number:");
                    accNum = scanner.nextLine();
                    boolean exists = false;
                    for (BankAccount acc : accounts) {
                        if (acc.getAccountNumber().equals(accNum)) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        System.out.println("Account Already Exists!");
                        break;
                    }
                    System.out.println("Enter Account Holder Name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter Initial Balance:");
                    double bal = Double.parseDouble(scanner.nextLine());
                    BankAccount newAcc = new BankAccount(accNum, name, bal);
                    accounts.add(newAcc);
                    System.out.println("Account Created Successfully!");
                    break;

                case "d":
                    System.out.println("Enter Sender Account Number:");
                    String senderAccNum = scanner.nextLine();
                    BankAccount senderAcc = null;
                    for (BankAccount acc : accounts) {
                        if (acc.getAccountNumber().equals(senderAccNum)) {
                            senderAcc = acc;
                            break;
                        }
                    }
                    if (senderAcc == null) {
                        System.out.println("Sender Account Does Not Exist!");
                        break;
                    }
                    System.out.println("Enter Receiver Account Number:");
                    String receiverAccNum = scanner.nextLine();
                    BankAccount receiverAcc = null;
                    for (BankAccount acc : accounts) {
                        if (acc.getAccountNumber().equals(receiverAccNum)) {
                            receiverAcc = acc;
                            break;
                        }
                    }
                    if (receiverAcc == null) {
                        System.out.println("Receiver Account Does Not Exist!");
                        break;
                    }
                    System.out.println("Enter Amount to Transfer:");
                    double amountToTransfer = Double.parseDouble(scanner.nextLine());
                    if (amountToTransfer > senderAcc.getBalance()) {
                        System.out.println("Insufficient Balance!");
                        break;
                    }
                    senderAcc.setBalance(senderAcc.getBalance() - amountToTransfer);
                    receiverAcc.setBalance(receiverAcc.getBalance() + amountToTransfer);
                    System.out.println("Transfer Successful!");
                    break;

                case "e":
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts found.");
                    } else {
                        System.out.println("Bank Accounts:");
                        for (BankAccount account : accounts) {
                            System.out.println("Account Number: " + account.getAccountNumber());
                            System.out.println("Account Holder Name: " + account.getAccountHolderName());
                            System.out.println("Balance: $" + account.getBalance());
                            System.out.println("---------------------");
                        }
                    }
                break;
                case "f":
               
                    break;
                case "g":
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
                            
               
        }
            }
    }
}




   





