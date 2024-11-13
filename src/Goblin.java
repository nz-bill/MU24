public class Goblin extends Enemy implements MeleeUnit{

    public Goblin(int health, String name, Item loot) {
        super(health, name, loot);
    }

    @Override
    public boolean performAction(Character target) {
        super.performAction(target);
        return true;
    }

    @Override
    public void meleeAttack(Character target) {

    }
}
