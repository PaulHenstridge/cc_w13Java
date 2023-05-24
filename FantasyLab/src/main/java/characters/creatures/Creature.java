package characters.creatures;

import characters.Character;
import characters.IFightable;
import items.Item;
import items.Treasure;

import java.util.ArrayList;

public abstract class Creature extends Character implements IFightable {
    public Creature(String name, int health, int damage, boolean isGood) {
        super(name, health, damage, isGood);
    }
}
