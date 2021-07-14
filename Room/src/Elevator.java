public class Elevator extends Room {
    int currentFloor;

    //constructor that takes the area of the elevator as a parameter
    public Elevator(int roomArea) {
        super(roomArea);
    }

    //accessor for floor
    public int getFloor(){
        return currentFloor;
    }

    //mutator void up(int floors) increases current floor by parameter
    public void up(int floors){
        this.currentFloor += floors;
    }

    //mutator void down(int floors) decreases current floor by parameter
    public void down(int floors){
        this.currentFloor -= floors;
    }

    //accessor string toString() that returns sq feet, capacity, and current floor
    public String toString(){
        return super.toString() + "Elevator Area=" + this.roomArea + " sq ft \n Elevator Capacity=" + this.getCapacity() + "\n Current Floor of elevator=" + this.getFloor()+ "\n";
    }
}
