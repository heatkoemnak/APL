
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
    public static HashMap<Integer, Create_Account> accounts= new HashMap<>();
    public void readTeacher(int TeaAccID,String teaName,String teaEmail,String role,String teaPassword){
        this.accID=TeaAccID;
        this.accName=teaName;
        this.accEmail=teaEmail;
        this.role=role;
        this.accPassword=teaPassword;

    }
    public void readStudent(int stuAccID,String stuName,String stuEmail,String role,String stuPassword){
        this.accID=stuAccID;
        this.accName=stuName;
        this.accEmail=stuEmail;
        this.role=role;
        this.accPassword=stuPassword;
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

public class Ex9 {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Create_Account teacher = new Create_Account(1,"John","John@gmail.com","teacher","John");
        Create_Account student = new Create_Account(2,"John1","John1@gmail.com","student","John01");
        Create_Account.accounts.put(teacher.getAccID(), teacher);
        Create_Account.accounts.put(student.getAccID(), student);
        boolean exit = false;
                while(!exit){
                    System.out.println("\n------------------------Enter options-------------------------------------");
                    System.out.println("a. Create Teacher Account\nb. Create Student Account\nc. Display Account\nd. exit");
                    System.out.print("Enter your choice: ");
                    String choice = sc.nextLine();
                    switch(choice){
                        case "a":
                        Create_Account TeacherAccount = new Create_Account(0,"", "","", "");
                             System.out.print("accID: ");
                            int accID = sc.nextInt();
                            //check id
                            if (
                                accID==teacher.getAccID()||accID==student.getAccID()
                            ){
                                System.out.println("This ID is already exist.");
                                break;
                            }
                            System.out.print("Teacher name: ");
                            sc.nextLine();
                            String teaName=sc.nextLine();
                            System.out.print("Email: ");
                            String teaEmail = sc.nextLine();
                            System.out.print("Password: ");
                            String TeaPassword = sc.nextLine();
                            String TeaRole="Teacher";
                            TeacherAccount.readTeacher(accID, teaName, teaEmail,TeaRole,TeaPassword);
                            Create_Account.accounts.put(accID,TeacherAccount);
                            System.out.println("account created successful.");
                            break;
                        case "b":
                            Create_Account studentAccount = new Create_Account(0,"", "","", "");
                            System.out.print("accID: ");
                            int stuAccID = sc.nextInt();
                            //check id
                            if (Create_Account.accounts.containsKey(stuAccID)){
                                System.out.println("This ID is already exist.");
                            }
                            System.out.print("Student name: ");
                            sc.nextLine();
                            String stuName=sc.nextLine();
                            System.out.print("Email: ");
                            String stuEmail = sc.nextLine();
                            System.out.print("Password: ");
                            String stuPassword = sc.nextLine();
                            String stuRole="Student";
                            studentAccount.readStudent(stuAccID, stuName, stuEmail,stuRole,stuPassword);
                            Create_Account.accounts.put(stuAccID,studentAccount);
                            System.out.println("account created successful.");
                            break;
                        case "c":
                            Create_Account acc = new Create_Account(0,"", "","", "");
                            acc.Display();
                            break;
                        case "d":
                            exit = true;
                            break;
                        default:
                            System.out.print("Invalid choice");
                    }
                }
            }

    
}

