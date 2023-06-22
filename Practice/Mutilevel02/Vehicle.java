
class VehicleCar{
    void ShowVehicleCar() {
        System.out.println("VehicleCar is running");
    }

}
class CarInfo extends VehicleCar{
   void ShowCarInfo() {
        System.out.println("CarInfo is running");
    }

}
class SportCar extends CarInfo{
    void ShowSportCar() {
        System.out.println("SportCar is running");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        SportCar vc = new SportCar();
        vc.ShowVehicleCar();
        vc.ShowCarInfo();
        vc.ShowSportCar();
        
       
    }
    
}
