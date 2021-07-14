public class House {
    //declare variables
    public int bedrooms;
    public double familyRoomArea;
    public double livingRoomArea;
    public String houseStyle;
    public double plot;

    //no argument constructor
    public House(){
        //represents a single house with its plot of land

    }

    //constructor that takes 5 parameters (houseStyle, familyRoomArea, livingRoomArea, bedrooms, plot)
    public House(String houseStyle, double familyRoomArea, double livingRoomArea, int bedrooms, double plot){
        this.houseStyle = houseStyle;
        this.familyRoomArea = familyRoomArea;
        this.livingRoomArea = livingRoomArea;
        this.bedrooms = bedrooms;
        this.plot = plot;
    }

    //accessors for instance variables
    public int getBedrooms(){
        return bedrooms;
    }

    public double getFamilyRoomArea(){
        return familyRoomArea;
    }

    public double getLivingRoomArea(){
        return livingRoomArea;
    }

    public double getPlot(){
        return plot;
    }

    public String getStyle(){
        return houseStyle;
    }

    public double getTotalArea(){
        //no params, each bedroom is 300sqft
        //returns double
        double totalBedroomArea = (double) bedrooms * 300;
        double totalArea = totalBedroomArea + familyRoomArea + livingRoomArea + plot;
        return totalArea;
    }

    public int compareArea(House otherHouse){
        //returns a negative value if current house sqft < otherHouse sqft
        //positive # if current sqft > otherHouse sqft
        //0 is equal
        if (this.getTotalArea() > otherHouse.getTotalArea()) {
            return 1;
        }
        else if (this.getTotalArea() < otherHouse.getTotalArea()){
                return -1;
        }
        else {
            return 0;
        }
    }

    public String toString(){
        //toString that returns house info
        //ex. "House style = Colonial, bedrooms=3, family room area=700.0, living room area=500.0, plot=0.7, square feet=2100.0"
        return "House Style = " + houseStyle + ", bedrooms = " + bedrooms + ", family room area = " + familyRoomArea + "sqft, living room area = " + livingRoomArea + "sqft, plot = " + plot + "sqft, total square feet = " + this.getTotalArea()+"sqft";
    }

    //setters for all instance variables
    public void setBedrooms(int numBedrooms){
        bedrooms = numBedrooms;
    }

    public void setFamilyRoomArea(int numFamilyRoomArea){
        familyRoomArea = numFamilyRoomArea;

    }

    public void setLivingRoomArea(int numLivingRoomArea){
        livingRoomArea = numLivingRoomArea;
    }

    public void setPlot(int numPlot){
        plot = numPlot;

    }

    public void setStyle(String houseType){
        houseStyle = houseType;

    }

}
