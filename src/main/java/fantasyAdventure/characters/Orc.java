package fantasyAdventure.characters;

import fantasyAdventure.interfaces.IAttack;
import fantasyAdventure.interfaces.IEnemy;

public class Orc extends Character implements IEnemy, IAttack {


    int damageValue;

    public Orc(String name, int damageValue) {
        super(name);
        this.damageValue = damageValue;
    }


    public void attack(Character character){
        character.takeDamage(damageValue);
    }


}
