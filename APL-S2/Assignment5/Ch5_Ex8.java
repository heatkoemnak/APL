import java.util.HashMap;

class Account{
    private int accID;
    private String name;
    private String email;
    private String password;

    Account(int accID,String name,String email,String password){
        this.accID = accID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getAccID(){
        return accID;
    }
    public String getAccName(){
        return name;
    }
    public String getAccEmail(){
        return email;
    }
    public String getAccPassword(){
        return password;
    }
    

}
class Info{
    private int stuID;
    private String stuName;
    private int stuYear;
    private String role;

    Info(int stuID,String stuName,String role,int stuYear){
        this.stuID = stuID;
        this.stuName = stuName;
        this.role = role;
        this.stuYear = stuYear;
       
    }

    public int getStuID(){
        return stuID;
    }
    public String getStuName(){
        return stuName;
    }
    public String getRole(){
        return role;
    }
    public int getStuYear(){
        return stuYear;
    }
   
}
class Teacher{
    private int teaID;
    private String teaName;
    private int teaYear;
    private String role;
    private String teaDep;

    Teacher(int teaID,String teaName,String role,int teaYear,String teaDep){
        this.teaID = teaID;
        this.teaName = teaName;
        this.teaYear = teaYear;
        this.role = role;
        this.teaDep = teaDep;
    }

    public int getTeaID(){
        return teaID;
    }
    public String getTeaName(){
        return teaName;
    }
    public String getRole(){
        return role;
    }
    public int getTeaYear(){
        return teaYear;
    }
    public String getTeaDep(){
        return teaDep;
    }

}



public class Ch5_Ex8 {
        public static HashMap<Integer,Account> accounts = new HashMap<>();
         public static HashMap<Integer,Info> infos = new HashMap<>();
         public static HashMap<Integer,Teacher> teachers = new HashMap<>();
    public static void main(String[] args) {

        Info student = new Info(1,"John1","student",1);
        Teacher teacher = new Teacher(2,"John2","teacher",3,"BIO");
        infos.put(student.getStuID(),student);        
        teachers.put(teacher.getTeaID(),teacher);

        for(Info info : infos.values()){
            System.out.println(info.getStuID()+" "+info.getStuName()+" "+info.getRole()+" "+info.getStuYear());

        }

        for(Teacher tea : teachers.values()){
            System.out.println(tea.getTeaID()+" "+tea.getTeaName()+" "+tea.getRole()+" "+tea.getTeaYear()+" "+tea.getTeaDep());

        }
        
    }

    
}
