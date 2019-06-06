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
    Troll troll;

    Armour armour;
    Treasure goldBar;

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
        troll = new Troll("Grendel", 10);

        iceBlast = new Spell(SpellType.ICEBLAST);
        axe = new Weapon(WeaponType.AXE);
        mushroom = new Potion(PotionType.MUSHROOM);

        goldBar = Treasure.GOLDBAR;

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
    }

    @Test
    public void knightHasArmourSoAttacksAreLessDeadly(){
        armour = Armour.SUIT;
        knight.addArmour(armour);
        warlock.attack(knight);
        assertEquals(94, knight.getHealth());
    }

    @Test
    public void charactersCanFightWithEnemy(){
        knight.attack(troll);
        troll.attack(knight);
        assertEquals(90, knight.getHealth());
        assertEquals(88, troll.getHealth());
    }

    @Test
    public void canBuildroom(){

    }
}
