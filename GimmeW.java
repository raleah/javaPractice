/* Lab 5a: Gimme a W
*  author@ Rachel Hyman*/
import java.util.Scanner;

public class GimmeW {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence or -1 to exit");

        //loop to check user input and exit if -1 or give location of 'w' or 't'
        while (true){
            String userInput = input.nextLine();

            //checks for -1 to exit
            if (userInput.equals("-1")){
                System.out.println("The program will exit now. Bye!");
                break;
            }

            //loops through each character of string and prints where w or t are located
            else{

                System.out.println("'w' or 't' are at locations ");
                for ( int i = 0; i < userInput.length(); i++){
                    if (userInput.charAt(i) == 'w' || userInput.charAt(i) == 't'){
                        System.out.println(i);
                    }

                }
            }
        }


    }
}
