import java.util.Scanner;

public class RockPaper {
    public static void main(String[] args){
        String playerItem;
        String computerItem;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Let's play rock, paper, scissors!");
        System.out.println("Please enter 0 for rock");
        System.out.println("Please enter 1 for paper");
        System.out.println("Please enter 2 for scissors");
        int playerChoice = Scanner.nextInt();

        // assign word to variable number for player
        if(playerChoice == 0){
            playerItem = "rock";
        }
        else if (playerChoice == 1){
            playerItem = "paper";
        }
        else
            playerItem = "scissors";

        /*Math.random() generates a random number from 0.0 to 0.999
         so Math.random() * 3 will be 0.0 - 2.99
         so generate double then cast to int*/
        double doubleRandomNumber = Math.random() * 3;
        //cast to int
        int randomNumber = (int)doubleRandomNumber;

        // assign word to variable number for computer
        if(randomNumber == 0){
            computerItem = "rock";
        }
        else if (randomNumber == 1){
            computerItem = "paper";
        }
        else
            computerItem = "scissors";

        //prints choice for both user and computer
        System.out.println("You chose "+ playerItem + " and the computer chose " + computerItem +"!");

        // 0 beats 2, 2 beats 1, 1 beats 0- win conditions
        if ( playerChoice == 0 && randomNumber == 1 || playerChoice == 1 && randomNumber == 2 || playerChoice == 2 && randomNumber == 0){
            System.out.println("The computer won!");
        }
        else if (playerChoice == 0 && randomNumber == 0 || playerChoice == 1 && randomNumber == 1 || playerChoice == 2 && randomNumber == 2){
            System.out.println("It's a tie!");
        }
        else {
            System.out.println("You won!");
        }

    }
}
