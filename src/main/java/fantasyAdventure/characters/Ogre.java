package fantasyAdventure.characters;

import fantasyAdventure.interfaces.IProtecter;

import java.util.Random;

public class Ogre extends Character implements IProtecter {

    private Random random;

    public Ogre(String name) {
        super(name);
        random = new Random();
    }

    @Override
    public void takeDamage(int damageValue) {
        boolean succesfulDeflect;
        succesfulDeflect = random.nextBoolean();

        if (!succesfulDeflect) {
            this.setHealth(this.getHealth() - damageValue);
        }
    }
}
