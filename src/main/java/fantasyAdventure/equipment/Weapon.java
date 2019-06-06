package fantasyAdventure.equipment;

public class Weapon {

    WeaponType weapon;

    public Weapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public int getDamageValue(){
        return this.weapon.getDamageValueFromEnum();
    }
}
