
public class Main {
    public static void main(String[] args) {
        Hero spiderMan = new Hero("Peter Parker", "spiderman");
        spiderMan.actor = "Tobey Maguire";
        spiderMan.gender = "Male";
        spiderMan.skill = new Skill[]{
                new Skill("Climb", Level.hard),
                new Skill("Jump", Level.expert),
                new Skill ("SpiderWeb", Level.basic),
                new Skill ("Strong", Level.hard)};
        spiderMan.age = 28;


        Hero ironMan = new Hero("Tony Stark", "Iroman");
        ironMan.actor = "Robert Downey Jr";
        ironMan.gender = "Male";
        ironMan.skill = new Skill[]{
                new Skill("billonary",Level.unlimited),
                new Skill("Fly",Level.medium),
                new Skill("Laser",Level.hard),
                new Skill("weapons",Level.basic),
                new Skill("Fight",Level.hard),
                new Skill("nanotech",Level.hard),
                new Skill("Wifi",Level.unlimited)};

        //Hero thor = new Hero();
        Hero thor = new Hero("Thor Odinson", "Thor");
        thor.actor = "Chris Hems";
        thor.gender = "Male";
        thor.skill = new Skill[]{
                new Skill("Storm Breaker", Level.medium),
                new Skill("Mijolnir", Level.expert),
                new Skill("Fly", Level.hard),
                new Skill("Thunder", Level.hard),
                new Skill("Strong", Level.medium),
                new Skill("Comedy", Level.zero)};
        thor.age = 2800;


        System.out.println(spiderMan);
        System.out.println();
        System.out.println(ironMan);
        System.out.println();
        System.out.println(thor.age);
        //System.out.println("El nombre es: " + spiderMan.name);
        //System.out.println("Las habilidades son: ");
        //spiderMan.useSkill();

        //ironMan.useSkill();



        /*
        Generar las funciones para crear un heroe por
        parte del usuario a través de la consola.

        Emmanuel estuvo aqui
         */
    }

}
