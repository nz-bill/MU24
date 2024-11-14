package enemies;

public abstract class Character {

    private int health;
    private String name;

    private int maxHealth;

    public Character(int health, String name) {
        this.health = health;
        this.maxHealth = health;
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void increaseHealth(int healthBoost){
        this.health += healthBoost;
        System.out.println(this.getName() + " hälsa är nu " + this.health);
    }

    public String getName() {
        return this.name;
    }

    public void takeDamage(int damage){
        this.health -= damage;

        System.out.println(this.getName() + " hälsa är nu " + this.health);
    }

    public void died(){
        System.out.println( this.name + " dog...");
    }

    public abstract boolean performAction(Character target);

    public void resetHealth(){
        this.health = this.maxHealth;
    }




}
