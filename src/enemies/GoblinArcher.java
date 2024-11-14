package enemies;

import enemies.Character;
import enemies.Enemy;
import items.Item;

public class GoblinArcher extends Enemy implements RangedUnit {


    private double range;
    public GoblinArcher(int health, String name, Item loot) {
        super(health, name, loot);
        this.range = 50;
    }

    @Override
    public boolean performAction(Character target) {
        super.performAction(target);
        return true;
    }

    @Override
    public void rangedAttack(Character target) {

    }

    @Override
    public double getRange() {
        return this.range;
    }
}
