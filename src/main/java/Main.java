public class Main {
    public static void main(String[] args) {
        Hero spiderMan = new Hero("Peter Parker", "spiderman");
        spiderMan.actor = "Tobey Maguire";
        spiderMan.gender = "Male";
        spiderMan.skill = new String[]{"Climb", "Jump", "SpiderWeb", "Strong"};
        spiderMan.age = 28;



        Hero ironMan = new Hero("Tony Stark","Iroman" );
        ironMan.actor = "Robert Downey Jr";
        ironMan.gender = "Male";
        ironMan.skill = new String[]{"Billionarie", "Fly", "Laser", "Weapons", "Fight", "Nanotech", "Wifi"};

        //Hero thor = new Hero();
        Hero thor = new Hero("Thor Odinson","Thor" );
        thor.actor = "Chris Hemsworth";
        thor.gender = "Male";
        thor.skill = new String[]{"Storm Breaker","Mijolnir","Fly","Thunder","Strong","Comedy"};
        thor.age = 2800;


        System.out.println(spiderMan);
        System.out.println("El nombre es: " + spiderMan.name);
        System.out.println("Las habilidades son: ");
        spiderMan.useSkill();

        System.out.println(ironMan);
        System.out.println("El nombre es: " + ironMan.name);
        System.out.println("Las habilidades son: ");
        ironMan.useSkill();



        /*
        Generar las funciones para crear un heroe por
        parte del usuario a través de la consola.
         */
    }

}
