import java.util.Random;

public class Player extends Character{

    public Player( String name) {

        super(100, name);
    }

    @Override
    public boolean performAction(Character target) {

        printActions();
        int input = InputHandler.getIntInRange(0,1);
        if (input == 1){
            punch( target);
            return true;
        }
       else return  false;
    }

    public void printActions(){
        System.out.println("Vad vill du göra?");
        System.out.println("1. slag");
        System.out.println("0. fly");
    }

    public void punch(Character enemy){
        System.out.println(this.getName() + " slår på " + enemy.getName());

        Random rng = new Random();
        int variance = rng.nextInt(-2,+3);
        enemy.takeDamage(5+variance);
    }

    @Override
    public String toString() {

        return "name: " + super.getName() + ", health: " + super.getHealth();
    }
}
