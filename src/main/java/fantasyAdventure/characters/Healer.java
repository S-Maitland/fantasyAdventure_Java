package fantasyAdventure.characters;

import fantasyAdventure.equipment.Potion;

public abstract class Healer extends Character{

    Potion activePotion;

    public Healer(String name, Potion activePotion) {
        super(name);
        this.activePotion = activePotion;
    }
}
