import fantasyAdventure.characters.*;
import fantasyAdventure.equipment.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class characterTest {

    Knight knight;
    Warlock warlock;
    Cleric cleric;
    Ogre ogre;

    Spell warlockActiveSpell;
    Weapon knightActiveWeapon;
    Potion clericActivePotion;

    Spell iceBlast;
    Weapon axe;
    Potion mushroom;

    @Before
    public void setUp(){

        knightActiveWeapon = new Weapon(WeaponType.SWORD);
        warlockActiveSpell = new Spell(SpellType.FIREBALL);
        clericActivePotion = new Potion(PotionType.ELIXIR);

        knight = new Knight("Sir Blawheart", knightActiveWeapon);
        warlock = new Warlock("Saruman", warlockActiveSpell);
        cleric = new Cleric("Dave", clericActivePotion);
        ogre = new Ogre("Thoug");

        iceBlast = new Spell(SpellType.ICEBLAST);
        axe = new Weapon(WeaponType.AXE);
        mushroom = new Potion(PotionType.MUSHROOM);

    }

    @Test
    public void knightHasName(){
        assertEquals("Sir Blawheart", knight.getName());
    }

    @Test
    public void canGetKnightsActiveWeapon(){
        assertEquals(knightActiveWeapon, knight.getActiveWeapon());
    }

    @Test
    public void canGetWarlocksSpellDamageValue(){
        assertEquals(12, warlock.getActiveSpell().getDamageValue());
    }

    @Test
    public void warlockCanAttackKnight(){
        warlock.attack(knight);
        assertEquals(88, knight.getHealth());
    }

    @Test
    public void clericCanHealKnight() {
        cleric.Heal(knight);
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void charactersCanChangeActiveWeaponSpellPotion(){
        warlock.setActiveSpell(iceBlast);
        knight.setActiveWeapon(axe);
        cleric.setActivePotion(mushroom);

        assertEquals(iceBlast, warlock.getActiveSpell());
        assertEquals(axe, knight.getActiveWeapon());
        assertEquals(mushroom, cleric.getActivePotion());
    }

    @Test
    public void mageClassCanCastOnProtector(){
        warlock.castProtector(ogre);
        knight.attack(warlock);

        assertEquals(ogre, warlock.getProtector());
        assertEquals(100, warlock.getHealth());
        assertEquals(88, ogre.getHealth());
    }
}
