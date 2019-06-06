import fantasyAdventure.characters.Cleric;
import fantasyAdventure.characters.Dwarf;
import fantasyAdventure.characters.Knight;
import fantasyAdventure.characters.Warlock;
import fantasyAdventure.equipment.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class characterTest {

    Knight knight;
    Warlock warlock;
    Cleric cleric;

    Spell warlockActiveSpell;
    Weapon knightActiveWeapon;
    Potion clericActivePotion;

    @Before
    public void setUp(){
        knightActiveWeapon = new Weapon(WeaponType.SWORD);
        warlockActiveSpell = new Spell(SpellType.FIREBALL);
        clericActivePotion = new Potion(PotionType.ELIXIR);

        knight = new Knight("Sir Blawheart", knightActiveWeapon);
        warlock = new Warlock("Saruman", warlockActiveSpell);
        cleric = new Cleric("Dave", clericActivePotion);
    }

    @Test
    public void knightHasName(){
        assertEquals("Sir Blawheart", knight.getName());
    }

    @Test
    public void canGetACharactersActiveWeapon(){
        assertEquals(knightActiveWeapon, knight.getActiveWeapon());
    }

    @Test
    public void canGetACharactersActiveWeaponDamageValue(){
        assertEquals(12, warlock.getActiveSpell().getDamageValue());
    }

    @Test
    public void charactersCanFightEachOther(){
        warlock.attack(knight);
        assertEquals(88, knight.getHealth());
    }

    @Test
    public void clericCanHeal() {
        cleric.Heal(knight);
        assertEquals(100, knight.getHealth());
    }
}
