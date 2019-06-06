package fantasyAdventure.equipment;

public class Spell {

    SpellType spell;

    public Spell(SpellType spell) {
        this.spell = spell;
    }

    public int getDamageValue() {
        return this.spell.getDamageValueFromEnum();
    }
}
