public class Hero {

    String name;
    String alias;
    String actor;
    String gender;
    String [] skill;
    int age;

    public void useSkill()
    {
        for (String s : skill) {
            System.out.println(s);
        }
    }

}
