import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Subdivision extends House {

    private ArrayList<House> houseList = new ArrayList<House>();

    Subdivision(){
        //Represents group of houses in subdivision
    }


    public boolean add(House h) {
        return houseList.add(h);
    }

    public House get(int i) {
        return houseList.get(i);
    }

    public ArrayList<House> list() {
        return houseList;
    }

    public int size() {
        return houseList.size();
    }

    public int find(String s) {
        for (int i = 0; i < houseList.size(); i++) {
            if (houseList.get(i).getStyle().equals(s)) {
                return  houseList.indexOf(houseList.get(i));
            }
        }
        return -1;
    }

    // accessor for bedrooms
    public ArrayList<House> listByBedrooms(int floor, int ceiling){
        ArrayList<House> bedroomList = new ArrayList<>();
        for (int i = 0; i < houseList.size(); i++) {
            if (houseList.get(i).getBedrooms() >= floor && houseList.get(i).getBedrooms() <= ceiling){
                bedroomList.add(houseList.get(i));
            }
        }
        return bedroomList;
    }

    //accessors added part 3

    /*returns list of houses in order originally added
    whose total area is greater than or equal to floor, and less than or equal to ceiling*/
    public ArrayList<House> listByArea(double floor, double ceiling) {
        ArrayList<House> areaList = new ArrayList<>();
        for(int i = 0; i < houseList.size(); i++){
            if (houseList.get(i).getTotalArea() >= floor && houseList.get(i).getTotalArea() <= ceiling ){
                areaList.add(houseList.get(i));
            }
        }
        return areaList;
    }

    /*returns list of houses in order originally added
    whose plot size is greater than or equal to floor, and less than or equal to ceiling*/
    public ArrayList<House> listByPlot(double floor, double ceiling){
        ArrayList<House> plotList = new ArrayList<>();
        for (int i = 0; i < houseList.size(); i++){
            if (houseList.get(i).getPlot() >= floor && houseList.get(i).getPlot() <= ceiling){
                plotList.add(houseList.get(i));
            }
        }
        return plotList;
    }

    /*The house with the smallest total area is listed first,
    and the house with the largest total area is listed last*/
    public ArrayList<House> sortByArea() {
        ArrayList<House> sortAreaList = new ArrayList<>();
       
        for (int i = 0; i < houseList.size(); i++) {
        	int currentMinIndex = i;
        	for (int j = i; j < houseList.size(); j++) {
        		if (houseList.get(j).compareArea(houseList.get(currentMinIndex)) < 0) {
                currentMinIndex = j;
        		}
        	}
        	sortAreaList.add(houseList.get(currentMinIndex));
        }
        houseList = sortAreaList;
        return houseList;
    }


    /*The house with the smallest total plot is listed first,
    and the house with the largest total plot is listed last*/
    public ArrayList<House> sortByPlot(){
        ArrayList<House> sortPlotList = new ArrayList<>();
        
        for (int i = 0; i < houseList.size(); i++) {
        	int currentMinIndex = i;
        	for (int j = i; j < houseList.size(); j++) {
        		if (houseList.get(j).getPlot() < (houseList.get(currentMinIndex).getPlot())) {
                currentMinIndex = j;
        		}
        	}
        	sortPlotList.add(houseList.get(currentMinIndex));
        }
        houseList = sortPlotList;
        return houseList;
    }

    /*writes the current contents of subDivision to disk,
    comma delimated, if successful, true. Else, false
     */
    public boolean toDisk() {
        try {
            PrintWriter myHouses = new PrintWriter("subdivision.txt");
            for (House House : houseList) {
                myHouses.write(House.getStyle() + "," + House.getFamilyRoomArea() + "," + House.getLivingRoomArea() + "," + House.getBedrooms() + "," + House.getPlot());
                myHouses.close(); }
                System.out.println("added to subdivision.txt");
                return true;

        } catch (IOException e) {
            System.out.println("unable to add to file");
            return false;
        }
    }

    /*reads current contents of subDivision.txt
    comma delimated, if successful, true. Else, false
     */
    public boolean fromDisk() {
        try {
            File mySubdivision = new File("subdivision.txt");
            Scanner myReader = new Scanner(mySubdivision);
            while (myReader.hasNextLine()) {
                String[] info = myReader.nextLine().split(",");
                House House = new House(info[0], Double.parseDouble(info[1]), Double.parseDouble(info[2]), Integer.parseInt(info[3]), Double.parseDouble(info[4]));
                houseList.add(House);

            }
            return true;
        }
        catch (FileNotFoundException e) {
            System.out.println("unable to read from file");
            return false;
        }
    }

    //one line - use the arrayList remove method
    public void remove(int position){
            houseList.remove(position);
        }

    public void update(int position, House houseToUpdate){
        //line 1 - remove the house at this position
        houseList.remove(position);
        //line 2 - add the house at this position (arrayList add method, two parameters)
        houseList.add(position, houseToUpdate);
    }
    
    public String toString() {
        return houseList.toString();
    }


}
