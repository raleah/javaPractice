import java.util.ArrayList;

public abstract class Vehicle {
    //instance variable that describes vehicle
    String vehicleType;

    //abstract method getTires, returns Arraylist<tire>
    public abstract ArrayList<Tire> getTires();

    //constructor that takes vehicle type as parameter
    Vehicle(String vehicleType){
        vehicleType = vehicleType;
    }
}
