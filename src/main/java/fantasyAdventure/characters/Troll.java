package fantasyAdventure.characters;

import fantasyAdventure.interfaces.IAttack;
import fantasyAdventure.interfaces.IEnemy;

public class Troll extends Character implements IEnemy, IAttack {

    int damageValue;

    public Troll(String name, int damageValue) {
        super(name);
        this.damageValue = damageValue;
    }

    public void attack(Character character){
        character.takeDamage(damageValue);
    }
}
