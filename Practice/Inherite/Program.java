
class ParentClass{
    String name;
    ParentClass(String name){
        this.name=name;
    }
    void GetParentClassName(String name){
        System.out.println("This is a parent class.named: "+name);
    }

}

class Child extends ParentClass{
    Child(String name){
        super(name);
    }
    void getChildName(String name){
        System.out.println("This is a child class.named: "+name);
    }

}
class Program{
    public static void main(String[] args){
        Child c = new Child("Child");
        c.getChildName("Child");
        c.GetParentClassName("Parent");
        
        
    }
}