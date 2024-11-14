package utility;

import java.util.Scanner;

public class InputHandler {

    private static Scanner scanner = new Scanner(System.in);


    public static int getIntInRange(int min, int max){
        while(true){

            while(!scanner.hasNextInt()){
                System.out.println("inte ett heltal, skriv igen");
                scanner.nextLine();
            }

            int input = scanner.nextInt();
            if(input >= min && input <= max){
                scanner.nextLine();
                return input;
            }
            System.out.println("skriv ett tal " + min + "-" +max);
            scanner.nextLine();
        }
    }

    public static boolean getTrueFalse(){

        while(true){
            String input = scanner.nextLine();

            if(input.toLowerCase().startsWith("j") || input.toLowerCase().startsWith("y")){
                return true;
            }

            if (input.toLowerCase().startsWith("n")){
                return false;
            }

            System.out.println("svara med 'ja' eller 'nej'");
        }
    }

    public static String getString(){
        return scanner.nextLine();
    }
}
