package enemies;

import enemies.Character;
import enemies.Enemy;
import items.Item;

import java.util.Random;

public class Goblin extends Enemy implements MeleeUnit {

    public Goblin(int health, String name, Item loot) {
        super(health, name, loot);
    }

    @Override
    public boolean performAction(Character target) {
        Random rng = new Random();

        int r = rng.nextInt(0,100);
        if(r < 20){
            super.performAction(target);
        } else if (r < 50) {
            meleeAttack(target);

        } else {
            System.out.println(this.getName() + " ser arg ut");
        }
        return true;
    }

    @Override
    public void meleeAttack(Character target) {
        System.out.println(this.getName() + " utför sin special attack!");
        target.takeDamage(30);
    }


}
