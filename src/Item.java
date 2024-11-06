public class Item {

    private String name;

    private int damageModifier;

    private int armourValue;

    private int healthModifier;

    public Item(String name, int damageModifier, int armourValue, int healthModifier) {
        this.name = name;
        this.damageModifier = damageModifier;
        this.armourValue = armourValue;
        this.healthModifier = healthModifier;
    }

    public String getName() {
        return name;
    }

    public int getDamageModifier() {
        return damageModifier;
    }

    public int getArmourValue() {
        return armourValue;
    }

    public int getHealthModifier() {
        return healthModifier;
    }
}
