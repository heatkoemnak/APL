
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Create_Account{
    private int accID;
    private String accName;
    private String accEmail;
    private String role;
    private String accPassword;

    Create_Account(int accID,String accName,String accEmail,String role,String accPassword){
        this.accID = accID;
        this.accName = accName;
        this.accEmail = accEmail;
        this.role=role;
        this.accPassword = accPassword;
    }
    

    public int getAccID(){
        return accID;
    }
    public String getAccName(){
        return accName;
    }
    public String getAccEmail(){
        return accEmail;
    }
    public String getRole(){
        return role;
    }
    public String getAccPassword(){
        return accPassword;
    }
    public static HashMap<String, Create_Account> accounts= new HashMap<>();
    public static Scanner sc = new Scanner(System.in);
    public void readTeacher(){
            System.out.print("accID: ");
            int accID = sc.nextInt();
            System.out.print("Teacher name: ");
            sc.nextLine();
            String teaName=sc.nextLine();
            System.out.print("Email: ");
            String teaEmail = sc.nextLine();
            System.out.print("Password: ");
            String TeaPassword = sc.nextLine();
            String TeaRole="teacher";
            Create_Account.accounts.put(teaName,new Create_Account(accID, teaName, teaEmail, TeaRole, TeaPassword));
            System.out.println("account created successful.");

    }
    
    public void readStudent(){
            System.out.print("accID: ");
            int stuAccID = sc.nextInt();
            System.out.print("Student name: ");
            sc.nextLine();
            String stuName=sc.nextLine();
            System.out.print("Email: ");
            String stuEmail = sc.nextLine();
            System.out.print("Password: ");
            String stuPassword = sc.nextLine();
            String stuRole="student";
            Create_Account.accounts.put(stuName,new Create_Account(stuAccID, stuName, stuEmail, stuRole, stuPassword));
            System.out.println("account created successful.");
    }
    
    public void Display(){
        File file = new File("C:\\Github Repo\\APL\\APL-S2\\Assignment5\\Accounts.txt");
        
        try{
            FileWriter writer = new FileWriter(file);
            writer.write("-----------------------------<<List accounts>>-----------------------------------------------\n");
                            writer.write("---------------------------------------------------------------------------------------------\n");
                            String columnTitles = String.format("|%-15s| %-20s| %-25s| %-17s| %-20s%n",  "accID",
                            "username",
                            "email",
                            "role",
                            "Password");
                            writer.write(columnTitles);
                            writer.write("---------------------------------------------------------------------------------------------\n");

            for(Create_Account acc:accounts.values()){
                String formattedLine=String.format("%-15d %-20s  %-27s %-20s %-21s%n",acc.getAccID(),acc.getAccName(),acc.getAccEmail(),acc.getRole(),acc.getAccPassword());
                writer.write(formattedLine);
            }
            writer.close();
            String line;
         try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            
         }catch (Exception e){
                System.out.println(e);
            }

    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }
       
    } 

}

class Ch5_Ex8{
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Create_Account teacher = new Create_Account(1,"Daly","dalychea@gmail.com","teacher","Daly002");
        Create_Account student = new Create_Account(2,"Koemnak","heatkimnak@gmail.com","student","Kim2002kk");
        Create_Account.accounts.put(teacher.getAccName(), teacher);
        Create_Account.accounts.put(student.getAccName(), student);
        Create_Account account = new Create_Account(0,"" ,"","","");
        boolean exit = false;
                while(!exit){
                    System.out.println("\n------------------------Enter Options-------------------------------------");
                    System.out.println("a.Create Teacher account\nb.Create Student Account\nc. Display Account\nd. exit");
                    System.out.print("Enter your choice: ");
                    String choice = sc.nextLine();
                    switch(choice){
                        case "a":
                            account.readTeacher();
                            break;
                        case "b":
                            account.readStudent();
                            break;
                        case "c":
                            account.Display();
                            break;
                        case "d":
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid choice");
                       
                    }
                }
            }

    
}

