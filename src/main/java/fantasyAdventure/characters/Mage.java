package fantasyAdventure.characters;

import fantasyAdventure.equipment.Spell;
import fantasyAdventure.interfaces.IAttack;
import fantasyAdventure.interfaces.IProtecter;

public abstract class Mage extends Character implements IAttack, IProtecter {

    Spell activeSpell;
    IProtecter protector;


    public Mage(String name, Spell activeSpell) {
        super(name);
        this.activeSpell = activeSpell;
        this.protector = null;
    }

    public Spell getActiveSpell() {
        return activeSpell;
    }

    public void setActiveSpell(Spell activeSpell) {
        this.activeSpell = activeSpell;
    }

    public void attack(Character character){
        character.takeDamage(this.activeSpell.getDamageValue());
    }

    public void castProtector(IProtecter protector){
        this.protector = protector;
    }

    public IProtecter getProtector() {
        return protector;
    }

    @Override
    public void takeDamage(int damageValue){
        if ((this.protector != null) && (this.protector.getHealth() > 0)){
            this.protector.takeDamage(damageValue);
        } else {
            super.takeDamage(damageValue);
        }
    }

}
