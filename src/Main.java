import java.awt.desktop.SystemEventListener;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int playerScore = 0;
    public static int aiScore = 0;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};

        boolean running = true;
        while(running){
            printMenu();
            int userChoice = getIntInRange(1,3,scanner);
            int aiChoice = aiChoice();
            System.out.println("input =" + choices[userChoice-1]);
            System.out.println("aiChoice = " + choices[aiChoice-1]);

            System.out.println(checkWinner(userChoice,aiChoice) + " wins the round");

            running = checkTotalWins(scanner);

        }



    }

    public static boolean checkTotalWins(Scanner sc){
        if (playerScore >= 3){
            System.out.println("YOU WIN!");
            System.out.println("play again?");
            playerScore = 0;
            aiScore = 0;
            return getYesOrNo(sc);
        }
        if (aiScore >= 3){
            System.out.println("YOU LOST!");
            System.out.println("play again?");
            playerScore = 0;
            aiScore = 0;
            return getYesOrNo(sc);
        }

        return true;
    }

    public static String checkWinner(int player, int ai){
        String winner;
        if (player-ai == 1 || player-ai == -2){
            winner = "player";
            playerScore++;

        } else if (ai == player) {
            winner = "draw";

        } else {
            winner = "ai";
            aiScore++;
        }

        return winner;
    }

    public static int aiChoice(){
        Random random = new Random();
        int choice = random.nextInt(1,4);

        return choice;

    }

    public static void printMenu(){

        System.out.println("player score:" + playerScore);
        System.out.println("ai score:" + aiScore);
        System.out.println("---------------------------------");
        System.out.println(" choose by entering a number 1-3");
        System.out.println("1. rock");
        System.out.println("2. paper");
        System.out.println("3. scissors");
    }
    public static boolean getYesOrNo(Scanner scanner){

        while(true){
            String input = scanner.nextLine();
            if (input.toLowerCase().startsWith("j") || input.toLowerCase().startsWith("y")){

                return true;
            }
            if (input.toLowerCase().startsWith("n") ){

                return false;
            }

            System.out.println("enter yes or no");
        }
    }

    public static int getIntInRange(int min, int max,Scanner sc){

        while(true){
            while (!sc.hasNextInt()){
                System.out.println("fel inmatning, skriv ett heltal");
                sc.nextLine();
            }

            int input = sc.nextInt();
            sc.nextLine();

            if( input >= min && input <= max){
                return input;
            }
            System.out.println("fel inmatning, skriv ett heltal " + min +"-" + max);
        }

    }
}




//TODO ett coolt spel

//TODO en spelare får välja sten, sax eller påse

//Todo datorn väljer sten sax påse

//todo spelet ska avgöra vem som vinne

//todo spelet håller reda på vinster och förluster

//todo spelet frågar om vi vill avsluta