package items;

import enemies.Character;

public class RangedWeapon extends Weapon implements Consumable{


    public RangedWeapon(String name, int damage) {
        super(name, damage);
    }


    @Override
    public void useItem(Character target) {
        System.out.println("använder " + this.getName() + " på " + target.getName());
        target.takeDamage(this.getDamage());

    }

    @Override
    public Item getCopy(){
        return new RangedWeapon(this.getName(),this.getDamage());
    }
}
