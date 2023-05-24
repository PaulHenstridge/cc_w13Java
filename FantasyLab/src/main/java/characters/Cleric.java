package characters;

import items.Item;
import items.Treasure;

import java.util.ArrayList;

public class Cleric extends Healers{
    public Cleric(String name, int health, ArrayList<Item> inventory, ArrayList<Treasure> coinpurse) {
        super(name, health, inventory, coinpurse);
    }

    @Override
    public void fight(Character character) {

    }
}
