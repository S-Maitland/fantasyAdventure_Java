package fantasyAdventure.equipment;

public enum PotionType {

    ELIXIR(40),
    MUSHROOM(20);

    private final int healthValue;

    PotionType(int healthValue){
        this.healthValue = healthValue;
    }

    public int getHealthValue(){
        return this.healthValue;
    }
}
