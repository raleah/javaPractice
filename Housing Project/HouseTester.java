public class HouseTester {
    public static void main(String[] args){
        //create two house objects with house details set
        House House1 = new House();
        House1.setBedrooms(3);
        House1.setFamilyRoomArea(200);
        House1.setLivingRoomArea(300);
        House1.setPlot(1000);
        House1.setStyle("Colonial");
        System.out.println(House1);

        House House2 = new House();
        House2.setBedrooms(4);
        House2.setFamilyRoomArea(400);
        House2.setLivingRoomArea(350);
        House2.setPlot(650);
        House2.setStyle("Modern");
        System.out.println(House2);

        System.out.println("House Area Comparison House 1: "+ House1.compareArea(House2));
        System.out.println("House Area Comparison House 2: "+ House2.compareArea(House1));



    }
}