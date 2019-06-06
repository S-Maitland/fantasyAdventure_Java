package fantasyAdventure.equipment;

public enum SpellType {

    FIREBALL(12),
    LIGHTNINGSTRIKE(16),
    ICEBLAST(8);

    private final int damageValue;

    SpellType(int damageValue){
        this.damageValue = damageValue;
    }

    public int getDamageValueFromEnum(){
        return this.damageValue;
    }
}
