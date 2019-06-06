package fantasyAdventure.characters;

import fantasyAdventure.interfaces.IProtecter;

public class Ogre extends Character implements IProtecter {
    public Ogre(String name) {
        super(name);
    }

    public void takeDamage(int damageValue) {
        this.setHealth(this.getHealth() - damageValue);
    }
}
