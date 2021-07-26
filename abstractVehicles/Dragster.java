import java.util.ArrayList;

public class Dragster extends Vehicle{

    Dragster() {
        super("Dragster");
    }

    @Override
    public ArrayList<Tire> getTires() {
        ArrayList<Tire> dragsterTires = new ArrayList<>();
        Tire tire1 = new Tire("slick");
        Tire tire2 = new Tire("slick");
        Tire tire3 = new Tire("medium");
        Tire tire4 = new Tire("medium");
        dragsterTires.add(tire1);
        dragsterTires.add(tire2);
        dragsterTires.add(tire3);
        dragsterTires.add(tire4);
        return dragsterTires;
    }
}
