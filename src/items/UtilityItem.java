package items;
import enemies.Character;
import items.Item;

public class UtilityItem extends Item implements Buff, Consumable{

    private int healthBoost;

    public UtilityItem(String name, int healthBoost) {
        super(name);
        this.healthBoost = healthBoost;
    }


    @Override
    public void useItem(Character target) {
        System.out.println("använder " + this.getName() + " på " + target.getName());
        target.increaseHealth(this.healthBoost);

    }

    @Override
    public Item getCopy(){
        return new UtilityItem(this.getName(),this.healthBoost);
    }
}
