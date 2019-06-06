package fantasyAdventure.Rooms;

import fantasyAdventure.interfaces.IEnemy;

public class FightRoom extends Room{

    IEnemy enemy;

    public FightRoom(String name, IEnemy enemy) {
        super(name);
        this.enemy = enemy;
    }

}
