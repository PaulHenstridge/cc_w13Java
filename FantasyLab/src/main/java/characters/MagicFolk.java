package characters;

import items.Item;
import items.Spell;
import items.Treasure;


import java.util.ArrayList;

public abstract class MagicFolk extends Character implements IFightable{

    private ArrayList<Spell> spells;

    public MagicFolk(String name, int health, ArrayList<Item> inventory, ArrayList<Treasure> coinpurse, ArrayList<Spell>spells ) {
        super(name, health, inventory, coinpurse);
        this.spells = new ArrayList<>();
    }
}
