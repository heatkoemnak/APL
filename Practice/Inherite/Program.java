
class ParentClass{
    String name;
    // ParentClass(String name){
    //     this.name=name;
    // }
    void GetParentClassName(String name){
        System.out.println("This is a parent class.named: "+name);
        System.out.println(GetSpeed()+" km.");
    }
    int GetSpeed(){
        return 130;
    }

}

class Child extends ParentClass{
    Child(String name){
        this.name=name;
    }
    int GetSpeed(){
        return 120;
    }
    void getChildName(String name){
        System.out.println("This is a child class.named: "+name);
        System.out.println(super.GetSpeed()+" km.");

    }

}
class Program{
    public static void main(String[] args){
        Child c = new Child("Child");
        c.GetParentClassName("Parent");
        c.getChildName("Child");
        
        
        
    }
}