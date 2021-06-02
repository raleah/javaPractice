import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //jack wallet
        System.out.println("Enter how many pounds Jack has:");
        int jackPounds = Scanner.nextInt();
        System.out.println("Enter how many shillings Jack has:");
        int jackShillings = Scanner.nextInt();
        System.out.println("Enter how many pence Jack has:");
        int jackPence = Scanner.nextInt();
        System.out.println("Jack has " + jackPounds + " pounds, " + jackShillings + " shillings, and " + jackPence + " pence to spend");

        //pie price
        System.out.println("Enter how much the Pie is in pounds:");
        int piePounds = Scanner.nextInt();
        System.out.println("Enter how much the Pie is in shillings:");
        int pieShillings = Scanner.nextInt();
        System.out.println("Enter how much the Pie is in pence:");
        int piePence = Scanner.nextInt();
        System.out.println("The pie costs " + piePounds + " pounds, " + pieShillings + " shillings, and " + piePence + " pence.");

        //beer price
        System.out.println("Enter how much the Beer is in pounds:");
        int beerPounds = Scanner.nextInt();
        System.out.println("Enter how much the Beer is in shillings:");
        int beerShillings = Scanner.nextInt();
        System.out.println("Enter how much the Beer is in pence:");
        int beerPence = Scanner.nextInt();
        System.out.println("The beer costs " + beerPounds + " pounds, " + beerShillings + " shillings, and " + beerPence + " pence.");


        /*convert 1 pound = 20 shillings = 240 pence
         max pounds, >20 shillings, >12 pence
         lunch cost won't exceed what jack has
         convert everything to pence, figure out, then convert back to pps
         total in pence */
        int jackTotal = (jackPounds * 20 * 12) + (jackShillings * 12) + jackPence;
        int pieTotal = (piePounds * 20 * 12) + (pieShillings * 12) + piePence;
        int beerTotal = (beerPounds * 20 * 12) + (beerShillings * 12) + beerPence;

        int changeAmount = jackTotal - pieTotal - beerTotal; //in pence

        int changePounds = changeAmount/(20*12);
        changeAmount = changeAmount % (20 * 12);


        int changeShillings = changeAmount / 12;
        changeAmount = changeAmount  % 12;

        int changePence = changeAmount;




        System.out.println("Jack's change is "+ changePounds +" pounds, "+ changeShillings +" shillings, and "+changePence+" pence.");








    }
}
