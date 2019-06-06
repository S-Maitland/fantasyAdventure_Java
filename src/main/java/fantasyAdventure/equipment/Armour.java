package fantasyAdventure.equipment;

public enum Armour {

    SUIT(0.5),
    CHAINMAIL(0.25),
    LEATHER(0.12);

    private final double durabilityValue;

    Armour(double durabilityValue){
        this.durabilityValue = durabilityValue;
    }

    public double getDurabilityValueFromEnum(){
        return this.durabilityValue;
    }
}
