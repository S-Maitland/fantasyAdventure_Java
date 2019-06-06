package fantasyAdventure.characters;

import fantasyAdventure.equipment.EquipmentType;
import fantasyAdventure.equipment.Spell;

public abstract class Mage extends Character{

    Spell activeSpell;

    public Mage(String name, Spell activeSpell) {
        super(name);
        this.activeSpell = activeSpell;
    }
}
