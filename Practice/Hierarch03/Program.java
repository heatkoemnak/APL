
class Vehicle{
    String name;
    void showVehicleInfo(){

        System.out.println("Vehicle's name is "+name);

    }

}
class Car extends Vehicle{
    Car(String name){
        this.name=name;
    }
    void showCarInfo(){
        System.out.println("Car's name is "+name);
    }
}
class Truck extends Vehicle{
    Truck(String name){
        this.name =name;

    }
    void showTruckInfo(){
        System.out.println("Truck's name is "+name);
    }

}

class Program {
    public static void main(String[] args){
        Car car = new Car("BMW");
        Truck truck = new Truck("Ford");
        car.showVehicleInfo();
        car.showCarInfo();

        truck.showTruckInfo();
        truck.showVehicleInfo();

    }
    
}
