
class Single{
    String name;
    String color;
    int speed;
 void display(){
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Speed: "+speed);
    }
    
}

class Car extends Single{
    Car(String name, String color, int speed){
        this.name = name;
        this.color = color;
        this.speed = speed;
    }
   
}
public class Single01 {
    public static void main(String[] args) {
        Car car = new Car(
            "BMW",
            "Black",
            200
        );
        car.display();
        
    }
    
    
}
