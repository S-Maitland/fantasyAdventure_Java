package fantasyAdventure.characters;

import fantasyAdventure.equipment.Spell;
import fantasyAdventure.equipment.Weapon;
import fantasyAdventure.interfaces.IAttack;

public abstract class Mage extends Character implements IAttack {

    Spell activeSpell;

    public Mage(String name, Spell activeSpell) {
        super(name);
        this.activeSpell = activeSpell;
    }

    public Spell getActiveSpell() {
        return activeSpell;
    }

    public void setActiveSpell(Spell activeSpell) {
        this.activeSpell = activeSpell;
    }

    public void attack(Character character){
        character.healCharacter(this.activeSpell.getDamageValue());
    }
}
