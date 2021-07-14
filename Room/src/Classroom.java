public class Classroom extends Room {
    int numberChairs;

    //constructor that takes the area of the classroom as a parameter
    public Classroom(int roomArea) {
        super(roomArea);
    }

    //constructor that takes the area of the classroom and the number of chairs as parameters
    public Classroom(int roomArea, int numberChairs){
        super(roomArea);
        this.numberChairs = numberChairs;

    }

    //mutator for chairs
    public void setNumberChairs(int numberChairs){
        this.numberChairs = numberChairs;
    }

    //accessor for chairs
    public int getNumberChairs(int numberChairs){
        return numberChairs;
    }

    //override for getCapacity
    public int getCapacity(){
        return super.getCapacity();
    }

    //accessor String toString() that returns square ft, capacity, and chairs
    public String toString(){
        return super.toString()+ "Square feet of classroom="+ roomArea +"\n Capacity of classroom="+ this.getCapacity() + "\n Chairs in classroom="+ this.numberChairs+ "\n";
    }
}
