package items;

import items.Item;

public abstract class Weapon extends Item implements Offence{

    private int damage;

    public Weapon(String name, int damage) {
        super(name);
        this.damage = damage;
    }


    public int getDamage() {
        return damage;
    }
}
