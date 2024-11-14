package enemies;

import enemies.Character;
import enemies.Enemy;
import items.Item;

public class GoblinAssassin extends Enemy implements MeleeUnit, RangedUnit {

    private double range;
    public GoblinAssassin(int health, String name, Item loot) {
        super(health, name, loot);
        this.range = 100;
    }

    @Override
    public boolean performAction(Character target) {
        super.performAction(target);
        return true;
    }

    @Override
    public void meleeAttack(Character target) {

    }

    @Override
    public void rangedAttack(Character target) {

    }

    @Override
    public double getRange() {
        return this.range;
    }
}
