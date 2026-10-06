public class WeaponFactory {
    public static Weapon createWeapon(String type) {
        // TODO:
        // Return a Sword, bow, or staff depending on type
        switch (type) {
            case "sword":
                return new Sword();
            case "bow":
                return new Bow();
            case "staff":
                return new Staff();
        }
        return null;
    }
}
