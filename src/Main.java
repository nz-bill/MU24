public class Main {
    public static void main(String[] args) {
      trCatch();

    }

    public static void trCatch(){

        testTryCatch t = new testTryCatch();

//        try{
//            t.run();
//        } catch (NullPointerException e){
//            System.out.println("vi fångar felet i main");
//        }

        t.run();


    }

    public  static void builder(){

        Monster m = new Monster.MonsterBuilder("Bill", 43).build();




        Monster m2 = new Monster.MonsterBuilder("Arne", 332)
                .withEyes(5)
                .withTail(true)
                .build();

        Monster m3 = new Monster.MonsterBuilder("Molgan", 6)
                .withEyes(2)
                .withLegs(5)
                .build();


        System.out.println(m.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
    }


    public static void singleton(){


        Singleton s = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();

        s.myMethod();
        s2.myMethod();


        System.out.println(" s = s2?" + (s == s2));

    }
}