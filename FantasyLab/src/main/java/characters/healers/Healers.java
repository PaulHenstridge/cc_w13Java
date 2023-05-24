package characters.healers;

import characters.Character;
import characters.IFightable;
import items.Healing;
import items.Item;
import items.Treasure;


import java.util.ArrayList;

public abstract class Healers extends Character implements IFightable {

    private ArrayList<Healing> healingItems;

    public Healers(String name, int health, int damage, boolean isGood) {
        super(name, health, damage, isGood);
        this.healingItems = new ArrayList<>();
    }
}
