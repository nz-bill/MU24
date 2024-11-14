package enemies;

import enemies.Character;
import items.*;
import utility.InputHandler;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player extends Character {


    private List<Item> inventory = new ArrayList<>();






    public Player( String name) {

        super(100, name);
    }

    @Override
    public boolean performAction(Character target) {

        printActions();
        int input = InputHandler.getIntInRange(0,2);
        if (input == 1){
            punch( target);
            return true;
        }
        if (input == 2){
            useItem(target);
            return true;
        }
       else return  false;
    }

    public void printActions(){
        System.out.println("Vad vill du göra?");
        System.out.println("1. slag");
        System.out.println("2. använd ett föeremål");
        System.out.println("0. fly");
    }

    public void useItem(Character target){
        if (inventory.size() <=0){
            return;
        }
        System.out.println("välj ett föremål att använda");
        for (int i = 0; i < inventory.size(); i++){
            System.out.println(i+1 + ": " + inventory.get(i));
        }

        int input = InputHandler.getIntInRange(1,inventory.size());


        Item currentItem = inventory.get(input-1);
        if(currentItem instanceof Buff){
            currentItem.useItem(this);
        }
        if (currentItem instanceof Offence){
            currentItem.useItem(target);
        }
        if (currentItem instanceof Consumable){
            inventory.remove(currentItem);
        }

    }

    public void punch(Character enemy){
        System.out.println(this.getName() + " slår på " + enemy.getName());

        Random rng = new Random();
        int variance = rng.nextInt(-2,+3);
        enemy.takeDamage(5+variance);
    }

    public List<Item> getInventory() {
        return inventory;
    }

    @Override
    public String toString() {

        return "name: " + super.getName() + ", health: " + super.getHealth()+ ", Inventory: " + inventory;
    }
}
