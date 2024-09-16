public class Main {
    public static void main(String[] args) {
        Hero spiderMan = new Hero();
        spiderMan.name = "Peter Parker";
        spiderMan.alias = "Spiderman";
        spiderMan.actor = "Tobey Maguire";
        spiderMan.gender = "Male";
        spiderMan.skill = new String[]{"Climb", "Jump", "SpiderWeb", "Strong"};
        spiderMan.age = 28;

        Hero ironMan = new Hero();
        ironMan.name = "Tony Stark";
        ironMan.alias="Ironman";
        ironMan.actor ="Robert Downey Jr";
        ironMan.gender="Male";
        ironMan.skill = new String[]{"Billionarie","Fly","Laser","Weapons","Fight","Nanotech","Wifi"};


        System.out.println(spiderMan);
        System.out.println("El nombre es: "+spiderMan.name);
        System.out.println("Las habilidades son: ");
        spiderMan.useSkill();

        System.out.println(ironMan);
        System.out.println("El nombre es: "+ironMan.name);
        System.out.println("Las habilidades son: ");
        ironMan.useSkill();

    }

}
