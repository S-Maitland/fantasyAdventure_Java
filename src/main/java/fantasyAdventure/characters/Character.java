package fantasyAdventure.characters;

import fantasyAdventure.equipment.EquipmentType;

import java.util.ArrayList;

public abstract class Character {

    private String name;
    private int health;

    public Character(String name) {
        this.name = name;
        this.health = 100;
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

}