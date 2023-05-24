package characters.creatures;

import characters.Character;
import items.Item;
import items.Treasure;

import java.util.ArrayList;

public class Ogre extends Creature {
    public Ogre(String name, int health, int damage, boolean isGood) {
        super(name, health, damage, isGood);
    }

    @Override
    public String fight(Character character) {
        return "You could say it's all...ogre for you LOL";
    }
}
