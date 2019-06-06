package fantasyAdventure.equipment;

public enum Treasure {

    GEM(400),
    GOLDBAR(100),
    AMULET(40);

    private final int treasureValue;

    Treasure(int treasureValue){
        this.treasureValue = treasureValue;
    }

    public int getTreasureValueFromEnum(){
        return this.treasureValue;
    }
}
