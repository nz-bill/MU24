package enemies;

import enemies.Character;

public interface RangedUnit {

    public abstract void rangedAttack(Character target);

    public abstract double getRange();
}
