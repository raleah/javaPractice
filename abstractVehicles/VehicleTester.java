import java.util.ArrayList;

public class VehicleTester {
    //tester for Vehicle class
    public static void main(String[] args){
        Vehicle b = new Bicycle();
        ArrayList<Tire> bikeTires = b.getTires();
        System.out.println("The size of the bicycle tires are:");
        for (int i = 0; i < bikeTires.size(); i++){
            String tires = bikeTires.get(i).getSize();
            System.out.println(tires);
        }

        Vehicle d = new Dragster();
        ArrayList<Tire> dragsterTires = d.getTires();
        System.out.println("The size of the dragster tires are:");
        for (int k = 0; k < dragsterTires.size(); k++){
            String dragTires = dragsterTires.get(k).getSize();
            System.out.println(dragTires);
        }

    }
}
