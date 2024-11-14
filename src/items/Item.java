package items;
import enemies.Character;

public abstract class Item {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "items.Item{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public abstract void useItem(Character target);

    public abstract Item getCopy();



}
