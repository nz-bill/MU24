import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);
    public static int getInt(){


        while(!scanner.hasNextInt()){
            System.out.println("skriv ett heltal");
            scanner.nextLine();
        }

        int i = scanner.nextInt();
        scanner.nextLine();
        return i;

    }

    public static int getIntInRange(int min, int max){


        while(true){
            while(!scanner.hasNextInt()){
                System.out.println("skriv ett heltal");
                scanner.nextLine();
            }

            int i = scanner.nextInt();
            if(i >= min && i <= max){
                scanner.nextLine();
                return i;
            }
            System.out.println("fel inmatning, ane ett heltal " + min +"-" + max);
            scanner.nextLine();
        }





    }

    public static String getString(){

        return scanner.nextLine();
    }

    public static String getWord(){
        String word = scanner.next();
        scanner.nextLine();
        return word;

    }
}
