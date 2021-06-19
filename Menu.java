import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Please enter a number based on the menu below:");
            System.out.println("[0] to Exit\n" +
                    "[1] Option 1\n" +
                    "[2] Option 2\n" +
                    "[3] Option 3\n" +
                    "[4] Option 4\n" +
                    "[5] Option 5");

            option = input.nextInt();
            String anyKey = input.nextLine();

            // switch statement for menu option 0-5, invalid input if other
            switch (option) {

                case 0 :
                    System.out.println("The program will now exit. Bye!");
                    System.exit(0);

                case 1 :
                    System.out.println("You Selected Option 1\n" +
                            "\n" +
                            "Press any key and then enter to continue\n");
                    anyKey = input.nextLine(); //allows input of any key to continue program

                    break;

                case 2 :
                    System.out.println("You Selected Option 2\n" +
                            "\n" +
                            "Press any key and then enter to continue\n");
                    anyKey = input.nextLine();
                    break;

                case 3 :
                    System.out.println("You Selected Option 3\n" +
                            "\n" +
                            "Press any key and then enter to continue\n");
                    anyKey = input.nextLine();
                    break;

                case 4 :
                    System.out.println("You Selected Option 4\n" +
                            "\n" +
                            "Press any key and then enter to continue\n");
                    anyKey = input.nextLine();
                    break;

                case 5 :
                    System.out.println("You Selected Option 5\n" +
                            "\n" +
                            "Press any key and then enter to continue\n");
                    anyKey = input.nextLine();
                    break;

                default :
                    System.out.println("Please enter a valid option");
                    //program terminates if invalid input

            }

        } while (option >= 0 && option <= 5);

    }
}
