import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();





    }


    public static void storingExample1(){

        Player p1 = new Player();
        Player p = new Player("Bill");

        Player p2 = p1;
        System.out.println("p2 = " + p2);


        ArrayList<Player> playerList = new ArrayList<>();

        playerList.add(p);
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p);

        System.out.println("p = " + p);
//        System.out.println(p.name);
//        System.out.println(p.id);
//        System.out.println(p.score);
//        System.out.println(p.health);
//        System.out.println(p.damage);


//        p1.name = "Arne";
        for (Player pl : playerList){
//            System.out.println("player = " + pl.name);
        }


    }
}