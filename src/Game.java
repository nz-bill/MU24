import java.util.Scanner;

public class Game {

    //private InputHandler inputHandler= new InputHandler();
    private Player p1;
    private Player p2;
    private Combat combat;

    public Game() {


        while(true){
            printMenu();
            int input = InputHandler.getIntInRange(0,1);

            if (input == 0){
                break;
            }
            //dghfgh

            if (input == 1){

                Combat c = new Combat(new Player("Bill"), new Player("Goblin"));

            }
        }

    }

    public void printMenu(){

        System.out.println("-----Meny------");

   
        System.out.println("vad vill du göra?");
        System.out.println("1. slåss");
        System.out.println("0. avsluta");

    }


}
