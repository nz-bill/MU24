package items;

import enemies.Character;

public class MeleeWeapon extends Weapon {
    public MeleeWeapon(String name, int damage) {
        super(name, damage);
    }


    @Override
    public void useItem(Character target) {
        System.out.println("använder " + this.getName() + " på " + target.getName());
        target.takeDamage(this.getDamage());
    }

    @Override
    public Item getCopy(){
        return new MeleeWeapon(this.getName(),this.getDamage());
    }
}
