import java.util.*;

public class Main {


    public static void main(String[] args) {

      listor();

//        greeting();
//        String input = getNameFromUser();
//
//        greetName(input);
//
//        greetName("boll");
//
//        greetName("Arne");

    }

    //vilkor
    public static void switchSats(){
        System.out.println("välj ett alternativ");
        System.out.println("1: säg hej");
        System.out.println("2: säg hej då");
        System.out.println("3: säg kanin");
        System.out.println("0: avsluta");

        String choice = getStringFromUser();

        switch (choice){
            case "3":
                System.out.println("kanin");
                break;
            case "1":
                System.out.println("första caset stämde");
                break;
            case "2":
                System.out.println("andra caset stämde");
                break;
            case "0":
                System.out.println("avslutar programmt...");
                break;
            default:
                System.out.println("inget alternativ matchar");

        }
    }
    public static void ifSats() {

        int x = 10;
        int y = 20;
        int z = 30;

        if(x < y){
            System.out.println("första påståendet är sant");
            if (y < z){
                System.out.println("bägge påståenden är sanna");
            }
        } else if(y > z){
            System.out.println("första påståendet är falskt, men det andra påståendet är sant");
        } else {
            System.out.println("bägge påståeenden är falska");
        }

        System.out.println("detta skriver vi jämt");

    }

    //funktion som returnerar ett värde
    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv ditt namn:");
        String input = scanner.nextLine();

        return input;
    }

    //funktion med in parametrar
    public static void greetName(String name) {


        System.out.println("hej " + name);
    }

    //funktion utan retur eller in parametrar
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv ditt namn:");
        String name = scanner.nextLine();


        System.out.println("hej " + name);
    }


    //loopar
    //for
    //foreach
    //while
    //do-while

    public static void forLoop(){

        String text = "hejsan";
        for (int i = 0; i < text.length(); i++){
            System.out.println(text.toCharArray()[i]);
        }
    }

    public static void whileLoop(){


        boolean running = true;

        while (running){

            System.out.println("ännu ett varv....");
            System.out.println("vill du avsluta?");
            String input = getStringFromUser();

            if (input.equals("ja")){
                running = !running;
            }
        }
    }


    public static void doLoop(){

        boolean running = true;
        do {
            System.out.println("ännu ett varv....");
            System.out.println("vill du avsluta?");
            String input = getStringFromUser();

            if (input.equals("ja")){
                running = false;
            }

        } while (running);

    }

    //forreach

    public static void forEachLoop(){
        int[] numbers = {17,34,32,3,4,5,6,7,8,9};

        char[] text = "hej".toCharArray();

        for (int i : numbers){

            if(i > 7){
                System.out.println("i = " + i);
            }

        }

    }
    //arrayer

    public static void arrayer(){

        int number = 15;
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        int[] numbers2 = new int[10];

        int[] numbers3 = numbers.clone();

        numbers3[5] = 511;

        for(int i : numbers2){
          //  System.out.println("i = " + i);
        }
        System.out.println("numbers = " + numbers);
        System.out.println("innehåll i numbers = " + Arrays.toString(numbers));

        System.out.println("numbers3 = " + numbers3);
        System.out.println("innehåll i numbers3 = " + Arrays.toString(numbers3));

        System.out.println("sista elementet " + numbers[numbers.length-2]);

    }

    public static void listor(){

        ArrayList<String> nameList = new ArrayList<>();

        HashSet<String> nameSet = new HashSet<>();

        HashMap<String, String> playerAsMap = new HashMap<>();

        playerAsMap.put("name", "Bill");
        playerAsMap.put("STR", "10000000");
        playerAsMap.put("equippedWepaon","ett coolt svärd");




        nameSet.add("Bill");
        nameSet.add("Boll");
        nameSet.add("Bill");
        nameSet.add("Arne");


        nameList.add("Bill");
        nameList.add("Bill");
        nameList.add("Bill");
        nameList.add("Bill");

        System.out.println("playerAsMap = " + playerAsMap);
        
        
        for (String k: playerAsMap.keySet()){

            System.out.println( k + " : " + playerAsMap.get(k));
        }

//        System.out.println("nameList = " + nameList);
//        System.out.println("nameSet = " + nameSet);
//
//        for (String s: nameSet){
//            if (s.startsWith("B")){
//                System.out.println("s = " + s);
//            }
//        }
//        System.out.println("nameSet = " + nameSet);
       // System.out.println("nameList.get(3) = " + nameList.get(3));



    }

}