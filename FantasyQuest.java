public class FantasyQuest {
    void main() {
        Weapon weapon = WeaponFactory.createWeapon("bow");

        Hero hero = new HeroBuilder()
                .setName("Aria")
                .setHeroClass("Ranger")
                .setLevel(5)
                .setWeapon(weapon)
                .build();

        hero.showInfo();
        hero.attack();

        HeroComponent poweredHero = new FirePower(new StrengthBoost(hero));

        poweredHero.attack();

        // Strategy
        BattleController battle = new BattleController();
        battle.setStrategy(new AggressiveStrategy());
        battle.fight();
        battle.setStrategy(new DefensiveStrategy());
        battle.fight();

        // Observer
        WeatherSystem weather = new WeatherSystem();
        WeatherObserver observer = new WeatherObserver("Aria");
        weather.addObserver(observer);
        weather.setWeather("Stormy");
        weather.setWeather("Snowy");
    }
}
