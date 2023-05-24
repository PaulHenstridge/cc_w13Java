package characters.creatures;

import characters.Character;
import items.Item;
import items.Treasure;

import java.util.ArrayList;

public class Troll extends Creature {
    public Troll(String name, int health, int damage, boolean isGood) {
        super(name, health, damage, isGood);
    }

    @Override
    public String fight(Character character) {
        return "FEE FI FO F**K YOU";
    }
}
