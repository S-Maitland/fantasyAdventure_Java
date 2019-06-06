import fantasyAdventure.characters.Dwarf;
import fantasyAdventure.characters.Knight;
import fantasyAdventure.characters.Warlock;
import fantasyAdventure.equipment.Spell;
import fantasyAdventure.equipment.SpellType;
import fantasyAdventure.equipment.Weapon;
import fantasyAdventure.equipment.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class characterTest {

    Knight knight;
    Warlock warlock;

    Spell warlockActiveSpell;
    Weapon knightActiveWeapon;

    @Before
    public void setUp(){
        knightActiveWeapon = new Weapon(WeaponType.SWORD);
        warlockActiveSpell = new Spell(SpellType.FIREBALL);
        knight = new Knight("Sir Blawheart", knightActiveWeapon);
        warlock = new Warlock("Saruman", warlockActiveSpell);
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
        assertEquals(16, dwarf.getActiveWeapon().getDamageValue());
    }

    @Test
    public void charactersCanFightEachOther(){
        dwarf.attack(knight);
        assertEquals(84, knight.getHealth());
    }
}
