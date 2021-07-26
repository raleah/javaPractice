import java.util.ArrayList;

public class Bicycle extends Vehicle{

    Bicycle() {
        super("Bicycle");
    }

    @Override
    public ArrayList<Tire> getTires() {
        ArrayList<Tire> bikeTires = new ArrayList<>();
        Tire tire1 = new Tire("skinny");
        Tire tire2 = new Tire("skinny");
        bikeTires.add(tire1);
        bikeTires.add(tire2);

        return bikeTires;
    }
}
