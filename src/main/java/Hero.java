public class Hero {

    String name;
    String alias;
    String actor;
    String gender;
    Skill [] skill;
    int age;

    @Override
    public String toString()
    {
        System.out.println("========================================");
        System.out.println(this.alias+" tiene estos poderes: ");
        useSkill();

        return this.name+" ->"+this.actor;

    }

    public void useSkill()
    {
        for (Skill s : skill) {
            System.out.println(s.skillName+"->"+s.skillLevel);
        }
    }

    public Hero(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }

    public Hero()
    {

    }
}

class Skill{
    String skillName;
    Level skillLevel;

    public Skill(String skillName, Level skillLevel) {
        this.skillName = skillName;
        this.skillLevel = skillLevel;
    }
}

enum Level{
    zero,
    basic,
    medium,
    hard,
    expert,
    unlimited
}