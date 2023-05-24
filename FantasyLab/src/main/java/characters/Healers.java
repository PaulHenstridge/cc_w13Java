package characters;

import items.Healing;
import items.Item;
import items.Treasure;


import java.util.ArrayList;

public abstract class Healers extends Character implements IFightable{

    private ArrayList<Healing> healingItems;

    public Healers(String name, int health, ArrayList<Item> inventory, ArrayList<Treasure> coinpurse, ArrayList<Healing> healingItems) {
        super(name, health, inventory, coinpurse);
        this.healingItems = new ArrayList<>();
    }
}
