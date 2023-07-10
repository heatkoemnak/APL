import java.util.Scanner;
class BankAccount{
   private double balance;
   private int accountNumber;
   private String accountName;
    Scanner scanner = new Scanner(System.in);
    public BankAccount(int accountNumber,String accountName, double balance){
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;

    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public void createAccount(String Name, int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.accountName = Name;
        this.balance = balance;
       

    }
    public double getBalance(){
        return balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getAccountName(){
        return accountName;
    }
   
    public void withdraw(double amount){
        
        
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
        

    }
    public void transfer(int recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transfer successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
        
    }
   
    // public void ShowAccount(){
    //     System.out.println("Account Number: " + accountNumber+", Account Holder Name: " + accountName+", Balance: $" + balance);
    // }
    public void display(){
            



        
        System.out.println("Account Number: " + getAccountNumber()+", Account Holder Name: " + getAccountName()+", Balance: $" + getBalance());
        
    }
}

public class Ex4 {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(1234,"John", 1000);      
 
        Scanner scanner = new Scanner(System.in);

        account.display();             
   
        char choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("a. Check Balance");
            System.out.println("b. Withdraw");
            System.out.println("c. createAccount");   
            System.out.println("d. Transfer");         
            System.out.println("e. DisplayallAccount");            
            System.out.println("f. Exit");

            choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.println("Balance : " + account.getBalance());
                    break;
                case 'b':
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 'c':
                    System.out.print("Enter account number: ");
                    int account_no = scanner.nextInt();
                    System.out.print("Enter account name: ");
                    String name = scanner.next();
                    System.out.print("Enter balance: ");
                    double balance = scanner.nextDouble();
                    account.createAccount( name,account_no,balance);
                    break;
                case 'd':
                    System.out.print("Enter recipient account number: ");
                    int recipientAccountNo = scanner.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    double  accountTransfer = scanner.nextDouble();
                    account.transfer(recipientAccountNo, accountTransfer);
                    break;
                case 'e':
                account.display();
                break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 'f');

        scanner.close();
       
    }
    
}
