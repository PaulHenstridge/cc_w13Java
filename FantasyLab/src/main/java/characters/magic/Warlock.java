package characters.magic;

import characters.Character;
import characters.creatures.Creature;
import items.Item;
import items.Spell;
import items.Treasure;

import java.util.ArrayList;

public class Warlock extends MagicFolk {

    public Warlock(String name, int health, int damage, boolean isGood) {
        super(name, health, damage, isGood);
    }

    @Override
    public String fight(Character character) {
        return "Zaap, I magicked your ass.";

    }

}
