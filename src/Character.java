public abstract class Character {

    private int health;
    private String name;

    public Character(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    public void takeDamage(int damage){
        this.health -= damage;

        System.out.println(this.getName() + " hälsa är nu " + this.health);
    }

    public abstract boolean performAction(Character target);

}
