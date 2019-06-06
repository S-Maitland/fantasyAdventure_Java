package fantasyAdventure.Rooms;

import fantasyAdventure.characters.Character;
import fantasyAdventure.equipment.Treasure;

import java.util.ArrayList;

public class TreasureRoom extends Room{

    ArrayList<Treasure> treasure;

    boolean roomComplete;

    public TreasureRoom(String name) {
        super(name);
        this.treasure = new ArrayList<Treasure>();
        this.roomComplete = false;
    }


    public void addTreasure(Treasure treasure){
        this.treasure.add(treasure);
    }

    public void removeTreasure(Character character){
        for (Treasure bounty: this.treasure){
            character.addBounty(bounty);
        }
        treasure.clear();
    }

    public int getCount(){
        return this.treasure.size();
    }

    public boolean checkCompletion(){
        if (this.treasure.size() == 0){
            this.roomComplete = true;
        }
        return roomComplete;
    }
}
