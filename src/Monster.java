public class Monster {
// obligatoriska variabler
    private String name;
    private int age;


    //valfria variabler
    private int eyes;

    private int arms;

    private int legs;

    private boolean tail;

    private boolean fangs;

    private Monster(MonsterBuilder monsterBuilder){
        this.name = monsterBuilder.name;
        this.age = monsterBuilder.age;
        this.eyes = monsterBuilder.eyes;
        this.legs = monsterBuilder.legs;
        this.arms = monsterBuilder.arms;
        this.tail = monsterBuilder.tail;
        this.fangs = monsterBuilder.fangs;

    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyes=" + eyes +
                ", arms=" + arms +
                ", legs=" + legs +
                ", tail=" + tail +
                ", fangs=" + fangs +
                '}';
    }


    public static class MonsterBuilder{
        // obligatoriska variabler
        private String name;
        private int age;


        //valfria variabler
        private int eyes;
        private int arms;
        private int legs;
        private boolean tail;
        private boolean fangs;

        public MonsterBuilder(String name, int age){
            this.name = name;
            this.age = age;
            this.legs = 2;
            this.arms = 2;


        }

        public MonsterBuilder withArms(int arms){
            this.arms = arms;
            return this;
        }
        public MonsterBuilder withTail(boolean tail){
            this.tail = tail;
            return this;
        }
        public MonsterBuilder withFangs(boolean fangs){
            this.fangs = fangs;
            return this;
        }

        public MonsterBuilder withLegs(int legs){
            this.legs = legs;
            return this;
        }

        public MonsterBuilder withEyes(int eyes){
            this.eyes = eyes;
            return this;
        }

        public Monster build(){
            Monster m = new Monster(this);
            return m;
        }
    }

}
