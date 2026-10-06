public class Hero implements HeroComponent {

    private String name;
    private String heroClass;
    private int level;
    private Weapon weapon;

    // TODO: appropiate constructor
    public Hero(String name, String heroClass, int level, Weapon weapon) {
        this.name = name;
        this.heroClass = heroClass;
        this.level = level;
        this.weapon = weapon;
    }

    @Override
    public void showInfo() {
        // TODO
        System.out.println("Name: " + name);
        System.out.println("Class: " + heroClass);
        System.out.println("Level: " + level);
        System.out.println("Weapon: " + this.weapon);
    }

    @Override
    public void attack() {
        // TODO: use the hero's weapon
        this.weapon.use();
    }
}
