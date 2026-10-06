public class StrengthBoost extends HeroDecorator {

    public StrengthBoost(HeroComponent hero) { // should be stackable with FirePower
        super(hero);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Hero attacks with extra strength!");
    }

}
