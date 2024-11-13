import java.util.Random;

public class Combat {

    private Player player;
    private Enemy enemy;

    private Character currentCharacter;
    private Character otherCharacter;

    public Combat(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;

        Random rng = new Random();
        if (rng.nextBoolean()){
            this.currentCharacter = player;
            this.otherCharacter = enemy;
        } else {
            this.currentCharacter = enemy;
            this.otherCharacter = player;
        }

        run();
    }

    public void run(){
        presentCombatants();

        boolean running = true;

        while(running){
            running = currentCharacter.performAction(otherCharacter);



            if (currentCharacter instanceof Player){
                currentCharacter = this.enemy;
                otherCharacter = this.player;
            } else {
                currentCharacter = this.player;
                otherCharacter = this.enemy;
            }
        }

    }

    public void presentCombatants(){
        System.out.println("du möter en " + enemy.toString());
        System.out.println(currentCharacter.getName() + " börjar...");

    }
}
