public class Singleton {


    // skapa en referens till instansen av det egna objektet
    private static Singleton instance;

    // andra medlemsvariabler som vanligt
     private String name;


     //konstruktor är privat, kan endast anropas innifrån klassen
    private Singleton(){}
    private Singleton(String name){
        //vi kan lägga setup rutiner i konstruktorn
        this.name = name;

        System.out.println("en instans av Singleton skapas");
    }


    //vi skapar objektet FÖRSTA gången vi anropar getInstance
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton("ett namn");
        }

        return instance;
    }

    public static Singleton getInstance(String name){
        if(instance == null){
            instance = new Singleton(name);
        }

        return instance;
    }

//resterande metoder dom vanligt
    public void myMethod(){

        System.out.println("jag är en metod");
    }
}
