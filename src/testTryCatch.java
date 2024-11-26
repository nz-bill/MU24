import java.util.Scanner;

public class testTryCatch {


    public void run() throws NullPointerException{
        Player p = new Player();

        System.out.println(p.child);

        try{
            System.out.println(p.child.name);

        } catch (NullPointerException e){
            e.printStackTrace();
        }


        System.out.println(p.child.name);

        System.out.println("allt gick bra");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();




//        if(p.child != null){
//            System.out.println(p.child.child);
//        } else {
//            System.out.println("Player has no child");
//        }

    }
}
