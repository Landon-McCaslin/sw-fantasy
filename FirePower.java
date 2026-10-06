public class FirePower extends HeroDecorator {

    public FirePower(HeroComponent hero) { // should be stackable with StrengthBoost
        super(hero);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("The attack is surrounded with magical fire!");
    }

}
