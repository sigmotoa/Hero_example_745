import java.util.Scanner;

public class Hero extends Person {

    String name;
    String alias;
    Person actor;
    private String gender;
    Skill [] skill;
    private int age;
    private int year = 2024;
    private int born;



    public void setBorn(int born) {
        this.born = born;
    }

    public void setGender(String gender)
    {
        this.gender=gender;
    }
    
    public String getGender()
    {
        return this.gender;
    }
    
    @Override
    public String toString()
    {
        System.out.println("========================================");
        System.out.println(this.alias+" tiene estos poderes: ");
        useSkill();

        System.out.println("Tiene "+this.age);
        return this.name+" ->"+this.actor;

    }

    public void useSkill()
    {
        for (Skill s : skill) {
            System.out.println(s.skillName+"->"+s.skillLevel);
        }
        ageCalculation();
    }

    public Hero(String name, String alias, int born)
    {
        
        this.name=name;
        this.alias=alias;
        this.born=born;
        ageCalculation();
    }

    public Hero(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }

    public Hero()
    {
    }
    
    private void ageCalculation()
    {
        this.age=year-this.born;
    }

    public void showAll()
    {
        System.out.println(this.name);
        System.out.println(this.actor.name);
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