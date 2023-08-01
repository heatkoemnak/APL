

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Login{
    private String role;
    private String username;
    private String email;
    private String password;
    Scanner sc = new Scanner(System.in);
    //constructor
    Login(String username,String email,String role, String password){
        
        this.username=username;
        this.email = email;
        this.role=role;
        this.password = password;
    }
    public static HashMap<String,Login> accounts = new HashMap<>();
    public String getRole(){
        return role;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;

    }
    public String EncryptPassword(){
        String encryptedPassword = "";
        for(int i = 0; i < password.length(); i++){
            encryptedPassword += (char)(password.charAt(i) + 1);
        }
        return encryptedPassword;
    }
   
    public void login(){
        do{
            if(accounts.isEmpty()){
                
                System.out.println("No account found. Please register first.");
                register();
                break;
            }else{
                System.out.println("Login Account");
                System.out.print("Enter your username: ");
                String username = sc.nextLine();
                System.out.print("Enter your password: ");
                String password = sc.nextLine();
                if(accounts.containsKey(username)){
                    Login account = accounts.get(username);
                    if(
                        account.getPassword().equals(password)
                    ){
                        System.out.println("Login successful!");
                        System.out.println("Hi!. "+account.getRole()+" :"+account.getUsername());
                        break;
                        } else {
                            System.out.println("Invalid password");
                        }
                    
                    
                }else{
                    System.out.println("Invalid username");
                }
               
            }

            
        }while(
            accounts.containsKey(username)

        );
        
    }
    
    public void register(){
       
        System.out.println("Create Account");
        
        System.out.print("Enter your name: ");
        this.username = sc.nextLine();
        System.out.print("Enter your email: ");
        this.email = sc.nextLine();
        System.out.print("Enter role:");
        this.role = sc.nextLine();
        System.out.print("Enter your password: ");
        this.password = sc.nextLine();
        accounts.put(getUsername(),new Login(username,email,role, password));
        System.out.println("\nAccount created successfully!");
    }
    public void Display(){
        File file = new File("C:\\Github Repo\\APL\\APL-S2\\Assignment5\\Accounts.txt");
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
        if(file.exists()){
            System.out.println("\nEmployee saved into file location "+file.getPath());
        }else{
            System.out.println("That file does not exist..");
        }

        try{
            FileWriter writer = new FileWriter(file);
            
            writer.write("-----------------------------<<List accounts>>------------------------------------\n");
            writer.write("----------------------------------------------------------------------------------\n");
            String columnTitles = String.format("|%-15s| %-25s| %-15s| %-20s%n",  "Username",
            "Email",
            "Role",
            "Password");
            writer.write(columnTitles);
            writer.write("----------------------------------------------------------------------------------\n");
            for(Login account : accounts.values()) {
                //sort by id
                String formattedLine=String.format("%-15s %-25s  %-16s  %-21s%n",account.getUsername(),account.getEmail(),account.getRole(),account.EncryptPassword());
                writer.write(formattedLine);
            }
            writer.close();

    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }
       
    } 
   

    public static void main(String[] args){

        Login account1 = new Login("koemnak","heatkimnak@gmail.com","Student","Kim2002kk");        
        Login account2 = new Login("jkim","jkim02k@gmail.com","Teacher","Jkim2023");

        accounts.put(account1.getUsername(), account1);
        accounts.put(account2.getUsername(), account2);
        Login account = new Login("","" ,"","");

            try(Scanner sc = new Scanner(System.in)){
                do{
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("1. Login\n2. Register\n3. Display Account\n4. exit");
                    System.out.print("Enter your choice: ");
                    int choice = sc.nextInt();
                    switch(choice){
                        case 1:
                            account.login();
                            break;
                        case 2:
                            account.register();
                            break;
                        case 3:
                             account.Display();
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    System.out.println("Do you want to continue? (y/n)");
                }while(
                    sc.next().charAt(0) == 'y'
                );
                }catch(Exception e){
                    System.out.println("Invalid input");
                }
                
                
        }
        
    }
