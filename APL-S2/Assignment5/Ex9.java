
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Login{
    private int accID;
    private String accName;
    private String accEmail;
    private String role;
    private String accPassword;

    Login(int accID,String accName,String accEmail,String role,String accPassword){
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
    public static HashMap<String, Login> accounts= new HashMap<>();
    public static Scanner sc = new Scanner(System.in);
    public void readTeacher(int TeaAccID,String teaName,String teaEmail,String role,String teaPassword){
        this.accID=TeaAccID;
        this.accName=teaName;
        this.accEmail=teaEmail;
        this.role=role;
        this.accPassword=teaPassword;

    }
   
    public boolean verifyLogin(String name,String password){
        
        if(accounts.containsKey(name)){
            Login account = accounts.get(name);
            if(account.getAccPassword().equals(password)){
                System.out.println("\nLogin successful");
                System.out.println("Hi!. ["+account.getRole()+"] :"+account.getAccName());
                return true;
            }
            else{
                System.out.println("Invalid password");
                return false;
            }
        }
        else{
            System.out.println("Invalid username");
            return false;
        }

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

            for(Login acc:accounts.values()){
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

class Ex9 {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Login teacher = new Login(1,"John","John@gmail.com","teacher","John");
        Login student = new Login(2,"John1","John1@gmail.com","student","John01");
        Login.accounts.put(teacher.getAccName(), teacher);
        Login.accounts.put(student.getAccName(), student);
        Login account = new Login(0,"" ,"","","");

        // try(Scanner sc = new Scanner(System.in)){
        //         do{
        //             System.out.println("-------------------------------------------------------------");
        //             System.out.println("1. Login\n2. Register\n3. Display Account\n4. exit");
        //             System.out.print("Enter your choice: ");
        //             int choice = sc.nextInt();
        //             switch(choice){
        //                 case 1:
        //                     Login TeacherAccount = new Login(0,"", "","", "");
        //                     System.out.print("accID: ");
        //                     int accID = sc.nextInt();
        //                     System.out.print("Teacher name: ");
        //                     sc.nextLine();
        //                     String teaName=sc.nextLine();
        //                     System.out.print("Email: ");
        //                     String teaEmail = sc.nextLine();
        //                     System.out.print("Password: ");
        //                     String TeaPassword = sc.nextLine();
        //                     String TeaRole="Teacher";
        //                     TeacherAccount.readTeacher(accID, teaName, teaEmail,TeaRole,TeaPassword);
        //                     Login.accounts.put(teaName,TeacherAccount);

        //                     break;
        //                 case 2:
        //                     Login studentAccount = new Login(0,"", "","", "");
        //                     System.out.print("accID: ");
        //                     int stuAccID = sc.nextInt();
        //                     System.out.print("Student name: ");
        //                     sc.nextLine();
        //                     String stuName=sc.nextLine();
        //                     System.out.print("Email: ");
        //                     String stuEmail = sc.nextLine();
        //                     System.out.print("Password: ");
        //                     String stuPassword = sc.nextLine();
        //                     String stuRole="Student";
        //                     studentAccount.readStudent(stuAccID, stuName, stuEmail,stuRole,stuPassword);
        //                     Login.accounts.put(stuName,studentAccount);
        //                     break;
        //                 case 3:
        //                     account.Display();
        //                     break;
        //                 case 4:
        //                 System.out.println("hello world");
                            
        //                 case 5:
        //                     System.exit(0);
        //                     break;
        //                 default:
        //                     System.out.println("Invalid choice");
        //             }
        //             System.out.println("Do you want to continue? (y/n)");
        //         }while(
        //             sc.next().charAt(0) == 'y'
        //         );
        //         }catch(Exception e){
        //             System.out.println("Invalid input");
        //         }



        boolean exit = false;
                while(!exit){
                    System.out.println("\n------------------------Create Account-------------------------------------");
                    System.out.println("1.Create Teacher \n2.Create Student\n3. Display Account\n4. login\n5. exit");
                    System.out.print("Enter your choice: ");
                    String choice = sc.nextLine();
                    switch(choice){
                        case "a":
                        Login TeacherAccount = new Login(0,"", "","", "");
                            System.out.print("accID: ");
                            int accID = sc.nextInt();
                            System.out.print("Teacher name: ");
                            sc.nextLine();
                            String teaName=sc.nextLine();
                            System.out.print("Email: ");
                            String teaEmail = sc.nextLine();
                            System.out.print("Password: ");
                            String TeaPassword = sc.nextLine();
                            String TeaRole="Teacher";
                            TeacherAccount.readTeacher(accID, teaName, teaEmail,TeaRole,TeaPassword);
                            Login.accounts.put(teaName,TeacherAccount);

                            break;
                        case "b":
                            Login studentAccount = new Login(0,"", "","", "");
                            System.out.print("accID: ");
                            int stuAccID = sc.nextInt();
                            System.out.print("Student name: ");
                            sc.nextLine();
                            String stuName=sc.nextLine();
                            System.out.print("Email: ");
                            String stuEmail = sc.nextLine();
                            System.out.print("Password: ");
                            String stuPassword = sc.nextLine();
                            String stuRole="Student";
                            studentAccount.readStudent(stuAccID, stuName, stuEmail,stuRole,stuPassword);
                            Login.accounts.put(stuName,studentAccount);
                            break;
                        case "c":
                            account.Display();
                            break;
                        case "d":
                        System.out.print("Enter name: ");
                        String name=sc.nextLine();
                        System.out.print("Enter name: ");
                        String password=sc.nextLine();
                        account.verifyLogin(name, password);
                        break;
                        case "e":
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid choice");

                       
                    }
                }
            }

    
}

