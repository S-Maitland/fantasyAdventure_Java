package fantasyAdventure.equipment;

public enum WeaponType {

    SWORD(12),
    AXE(16),
    CLUB(8);

    private final int damageValue;

    WeaponType(int damageValue){
        this.damageValue = damageValue;
    }

    public int getDamageValueFromEnum(){
        return this.damageValue;
    }

}
