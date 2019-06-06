package fantasyAdventure.characters;

import fantasyAdventure.equipment.Weapon;
import fantasyAdventure.interfaces.IAttack;

public abstract class Fighter extends Character implements IAttack {

    Weapon activeWeapon;

    public Fighter(String name, Weapon activeWeapon) {
        super(name);
        this.activeWeapon = activeWeapon;
    }

    public Weapon getActiveWeapon() {
        return activeWeapon;
    }

    public void setActiveWeapon(Weapon activeWeapon) {
        this.activeWeapon = activeWeapon;
    }

    public void attack(Character character){
        character.takeDamage(this.activeWeapon.getDamageValue());
    }

}
