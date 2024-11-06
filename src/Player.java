import java.util.Random;

public class Player {

    private int id;

    private long score;
    private String name;

    private int health;

    private int damage;

    private Item equippedItem;

    public Item getEquippedItem() {


        return equippedItem;
    }

    public void setEquippedItem(Item equippedItem) {


        this.equippedItem = equippedItem;
        System.out.println(this.name + " har hittat en " + this.equippedItem.getName());
        if (equippedItem.getHealthModifier() > 0){
            this.health = this.health + equippedItem.getHealthModifier();
            System.out.println(this.name +"s hälsa ökar till " + this.health);
        }
    }

    public Player(){
        System.out.println("nu har vi skapat objektet " + this + " med den 'tomma' konstruktorn");
    }
    public Player(String name){

        this.name = name;
        this.health = 100;
        this.damage = 10;


       // System.out.println("nu har vi skapat objektet" + this + " med den 'andra' konstruktorn");
    }

    public void attack(Player enemy){
        Random rng = new Random();



        int damageVariance = rng.nextInt(this.damage-2,this.damage+3);

        int totaldamage = damageVariance + this.equippedItem.getDamageModifier();
        System.out.println(this.name +" attackerar " + enemy.name + " för " + totaldamage + " skadepoäng");
        enemy.takeDamage(totaldamage);

    }

    public void takeDamage(int damage){
        if(this.equippedItem.getArmourValue() > 0){
            damage -= this.equippedItem.getArmourValue();
            System.out.println(this.name + " blockerar "
                    + this.equippedItem.getArmourValue()
                    + " skadepoäng med sin " + this.equippedItem.getName());
            System.out.println("den totlala skadan blir " + damage);
        }
        this.health -= damage;

    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }


}
