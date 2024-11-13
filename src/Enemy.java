import java.util.Random;

public abstract class Enemy extends Character {

    private Item loot;
    public Enemy(int health, String name, Item loot) {
        super(health, name);
        this.loot = loot;
    }

    @Override
    public boolean performAction(Character target){
        //System.out.println(this.getName() + " ser arg ut");
        System.out.println( this.getName() + " attackerar " + target.getName());
        Random rng = new Random();
        int variance = rng.nextInt(-2,+3);
        target.takeDamage(5+variance);
        return true;
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
