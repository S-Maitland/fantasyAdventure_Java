package fantasyAdventure.characters;

import fantasyAdventure.equipment.Armour;
import fantasyAdventure.equipment.Weapon;
import fantasyAdventure.interfaces.IAttack;

public abstract class Fighter extends Character implements IAttack {

    Weapon activeWeapon;
    Armour armour;

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

    public void takeDamage(int damageValue) {
        if (this.armour != null){
            this.setHealth(this.getHealth() - ((int) (this.armour.getDurabilityValueFromEnum() * damageValue)));
        } else {
            super.takeDamage(damageValue);
        }
    }

    public void addArmour(Armour armour) {
        this.armour = armour;
    }
}
