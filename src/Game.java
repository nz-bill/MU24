import java.util.Scanner;

public class Game {


    private Player p1;
    private Player p2;
    private Combat combat;

    public Game() {


        while(true){
            printMenu();
            int input = getIntFromInput();

            if (input == 0){
                break;
            }

            if (input == 1){

                Combat c = new Combat(new Player("Bill"), new Player("Goblin"));

            }
        }

    }

    public void printMenu(){
        System.out.println("vad vill du göra?");
        System.out.println("1. slåss");
        System.out.println("0. avsluta");

    }

    public int getIntFromInput(){
        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNextInt()){
            System.out.println("skriv ett heltal");
            scanner.nextLine();
        }

        int i = scanner.nextInt();
        scanner.nextLine();
        return i;

    }
}
