import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static void showSubdivision(ArrayList<House> subDivisionToShow){
        for (House House : subDivisionToShow){
            System.out.println("House Style: " + House.getStyle() + "\nfamily room area: " + House.getFamilyRoomArea() + "\nliving room area: " + House.getLivingRoomArea() + "\nbedrooms: " + House.getBedrooms() + "\nplot size: " + House.getPlot());
        }
    }

    public static void main(String[] args) {
        Subdivision sub1 = new Subdivision();
        sub1.fromDisk();

        Scanner kybd = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "[0] to Exit\n" +
                            "[1] Display All Houses in the Subdivision\n" +
                            "[2] Add a House to the Subdivision\n" +
                            "[3] Delete a House in the Subdivision\n" +
                            "[4] Change a House in the Subdivision\n" +
                            "[5] Filter Subdivision by Total Area and Display\n" +
                            "[6] Filter Subdivision by Plot Size and Display\n" +
                            "[7] Sort Subdivision by Total Area and Display\n" +
                            "[8] Sort Subdivision by Plot Size and Display\n" +
                            "[9] Save Subdivision to Text File\n" +
                            "Enter a number from 0 to 9:");
            int input = kybd.nextInt();

            switch (input) {
                case 0:
                    System.exit(0);

                case 1:
                    Menu.showSubdivision(sub1.list());
                    break;

                case 2:
                    System.out.println("Adding a house to subdivision!");
                    String houseStyle;
                    double familyRoomArea;
                    double livingRoomArea;
                    double plot;
                    int bedrooms;
                    System.out.println("Please enter the style of the house: ");
                    houseStyle = kybd.next();
                    System.out.println("Please enter the family room area: ");
                    familyRoomArea = Double.parseDouble(kybd.next());
                    System.out.println("Please enter the living room area: ");
                    livingRoomArea = Double.parseDouble(kybd.next());
                    System.out.println("Please enter the number of bedrooms: ");
                    bedrooms = kybd.nextInt();
                    System.out.println("Please enter the plot: ");
                    plot = Double.parseDouble(kybd.next());
                    sub1.add(new House(houseStyle, familyRoomArea, livingRoomArea, bedrooms, plot));
                    System.out.println("Your house has been added to the subdivision!");
                    break;

                case 3:
                    System.out.println("Please enter the position of the house to be deleted: ");
                    sub1.remove(kybd.nextInt());
                    break;

                case 4:
                    System.out.println("Please enter the position of the house to be changed: ");
                    int housePosition = kybd.nextInt();
                    System.out.println("Please enter the style of the house: ");
                    houseStyle = kybd.next();
                    House house = sub1.get(housePosition);
                    house.setStyle(houseStyle);
                    sub1.update(housePosition, house);

                case 5:
                    System.out.println("Please enter a minimum area followed by a maximum area to display");
                    Double minimum = Double.parseDouble(kybd.next());
                    Double max = Double.parseDouble(kybd.next());
                    Menu.showSubdivision(sub1.listByArea(minimum, max));
                    break;

                case 6:
                    System.out.println("Please enter a maximum area followed by a minimum area to display");
                    Double minimum2 = Double.parseDouble(kybd.next());
                    Double max2 = Double.parseDouble(kybd.next());
                    Menu.showSubdivision(sub1.listByPlot(minimum2, max2));
                    break;

                case 7:
                    Menu.showSubdivision(sub1.sortByArea());
                    break;

                case 8:
                    Menu.showSubdivision(sub1.sortByPlot());
                    break;

                case 9:
                    sub1.toDisk();
                    break;

                default:
                    System.out.println("Please enter a valid option");


            }
        }
    }

}
