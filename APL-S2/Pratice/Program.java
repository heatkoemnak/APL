class Student{
    String FirstName;
    String LastName;

    Student(String f, String l){
        FirstName = f;
        LastName = l;

    }
    void FullName(){
        System.out.println(FirstName + " " + LastName);
        
    }

}



public class Program {
    public static void main (String [] args){
        Student student1 = new Student("Heat","Koemnak");
        Student student2 = new Student("Heat","Kimnak");
        new Student("Som","SoPheak").FullName();
        student1.FullName();
        student2.FullName();


    }

    
}