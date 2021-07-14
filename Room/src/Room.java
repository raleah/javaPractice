public class Room {
    int roomArea;

    //constructor that takes the area of the room as a parameter
    public Room(int roomArea){
        this.roomArea = roomArea;
    }

    //accessor int getSquareFeet() that returns the area of the room
    public int getSquareFeet(){
        return roomArea;
    }

    //accessor int getCapacity() that returns the capacity of the room. roomArea/9
    public int getCapacity(){
        int capacity;

        capacity = roomArea/9;
        return capacity;
    }

    //mutator setSquareFeet(int area) that sets the square feet of the room
    public void setSquareFeet(int area){
        roomArea = area;
    }

    //accessor String toString() that returns the square feet and capacity of the room
    public String toString(){
        return "Area in square feet =" + roomArea +"\n Capacity of room=" + this.getCapacity()+ "\n";
    }


}
