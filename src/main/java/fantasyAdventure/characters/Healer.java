package fantasyAdventure.characters;

import fantasyAdventure.equipment.Potion;
import fantasyAdventure.equipment.Spell;
import fantasyAdventure.interfaces.IHeal;

public abstract class Healer extends Character implements IHeal {

    Potion activePotion;

    public Healer(String name, Potion activePotion) {
        super(name);
        this.activePotion = activePotion;
    }

    public Potion getActivePotion() {
        return activePotion;
    }

    public void setActiveSpell(Spell activeSpell) {
        this.activePotion = activePotion;
    }

    public void Heal(Character character) {
        character.healCharacter(this.activePotion.getHealthValue());
    }
}
