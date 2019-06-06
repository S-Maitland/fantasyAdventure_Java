package fantasyAdventure.characters;

import fantasyAdventure.equipment.Treasure;

import java.util.ArrayList;

public abstract class Character {

    private String name;
    private int health;
    private ArrayList<Treasure> bounties;

    public Character(String name) {
        this.name = name;
        this.health = 100;
        this.bounties = new ArrayList<Treasure>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damageValue){
        this.health -= damageValue;
    }

    public void healCharacter(int healthValue) {
        if (this.health + healthValue > 100) {
            this.health = 100;
        } else {
            this.health += healthValue;
        }
    }

}
