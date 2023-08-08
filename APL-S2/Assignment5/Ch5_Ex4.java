import java.util.HashMap;

class Enroll{
    private int DepID;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    
    Enroll(int DepID, String name , int age, String address, String phoneNumber){
        this.DepID = DepID;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    HashMap <Integer,Enroll> Enrolls = new HashMap<>();
    public int GetDepID(){
        return DepID;
    }   
    public String GetName(){
        return name;
    }
    public int GetAge(){
        return age;
    
    }
    public String GetAddress(){
        return address;
    }
    public String GetTel(){
        return phoneNumber;
    }
    public void Display(){
        System.out.println("DepID: "+GetDepID());
        System.out.println("name: "+ GetName());
        System.out.println("age: "+GetAge());
        System.out.println("address: "+GetAddress());
        System.out.println("phoneNumber: "+GetTel());

    }

}



class Ch5_Ex4 {
    public static void main(String [] args){
        Enroll student = new Enroll(1, "Koemnak", 20, "Phnom Penh", "093293209");
        student.Enrolls.put(student.GetDepID(), student);

        student.Display();
       
    }
    
}
