package characters;

import items.Item;
import items.Spell;
import items.Treasure;

import java.util.ArrayList;

public class Warlock extends MagicFolk {

    public Warlock(String name, int health, ArrayList<Item> inventory, ArrayList<Treasure> coinpurse, ArrayList<Spell> spells) {
        super(name, health, inventory, coinpurse, spells);
    }

    @Override
    public void fight(Character character) {

    }
}
