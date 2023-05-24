package characters;

import items.Item;
import items.Treasure;
import items.Weapon;

import java.util.ArrayList;

public class Knights extends Fighters{
    public Knights(String name, int health, ArrayList<Item> inventory, ArrayList<Treasure> coinpurse, ArrayList<Weapon> weapons) {
        super(name, health, inventory, coinpurse, weapons);
    }

    @Override
    public void fight(Character character) {

    }
}
