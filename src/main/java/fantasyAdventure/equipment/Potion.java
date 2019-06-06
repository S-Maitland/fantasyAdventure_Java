package fantasyAdventure.equipment;

public class Potion {

    PotionType potion;

    public Potion(PotionType Potion) {
        this.potion = Potion;
    }

    public int getHealthValue() {
        return this.potion.getHealthValueFromEnum();
    }
}
