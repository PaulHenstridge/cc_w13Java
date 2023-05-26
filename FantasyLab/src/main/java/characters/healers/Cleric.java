package characters.healers;

import characters.Character;
import characters.healers.Healers;
import items.Item;
import items.Treasure;

import java.util.ArrayList;

public class Cleric extends Healers {
    public Cleric(String name, int health, int damage, boolean isGood) {
        super(name, health, damage, isGood);
    }

    @Override
    public String fight() {
        return "I have healed you with my funky potion";
    }
}
