import enemies.*;

import items.*;
import utility.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private Player player;
    private List<Enemy> enemyList = new ArrayList<>();
    private List<Item> itemList = new ArrayList<>();
    public Game() {
        initItemList();
        initEnemyList();
        createPlayer();
        run();

    }


    public void run(){
        boolean running = true;
        while(running){
            printMenu();

            int input = InputHandler.getIntInRange(0,2);
            if(input == 1){
                System.out.println(player.toString());
            }
            if (input == 2){
                initCombat();
            }

            if (input == 0){
                System.out.println("hej då");
                running = false;
            }

            if(player.getHealth() <= 0){
                running = gameOver();;

            }
        }

    }

    public void initCombat(){
        Random rng = new Random();
        int i = rng.nextInt(0,enemyList.size());
        Enemy enemy = enemyList.get(i);

        new Combat(this.player,enemy);
    }

    public boolean gameOver(){
        System.out.println("GAME OVER!");
        System.out.println("du dog..");
        System.out.println("vill du spela igen?");
        boolean choice = InputHandler.getTrueFalse();
        player.resetHealth();

        return choice;
    }




    public void printMenu(){
        System.out.println("vad vill du göra?");
        System.out.println("1. se status");
        System.out.println("2. ut och slåss");
        System.out.println("0. avsluta");
    }

//        System.out.println("player = " + player);
//        enemyList.forEach(e -> System.out.println(e));
//        itemList.forEach(item -> System.out.println(item));
    public void createPlayer(){

        System.out.println("skriv ditt namn:");
        String name = InputHandler.getString();

        this.player = new Player(name);

    }

    public void initEnemyList(){
        enemyList.add(new Goblin(50,"enemies.Goblin A", itemList.get(0)));
        enemyList.add(new Goblin(70,"enemies.Goblin B", itemList.get(1)));
        enemyList.add(new GoblinArcher(50,"enemies.Goblin Archer A", itemList.get(2)));
        enemyList.add(new GoblinArcher(50,"enemies.Goblin Archer B", itemList.get(3)));
        enemyList.add(new GoblinAssassin(50,"enemies.Goblin Assassin", itemList.get(4)));

    }

    public void initItemList(){
        itemList.add(new MeleeWeapon("dagger", 10));
        itemList.add(new MeleeWeapon("Sword", 20));
        itemList.add(new RangedWeapon("Short Bow", 25));
        itemList.add(new RangedWeapon("crossbow", 50));
        itemList.add(new UtilityItem("Health Potion", 25));
    }
}
