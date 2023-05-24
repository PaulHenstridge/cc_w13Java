package characters;

import items.Item;
import items.Treasure;
import items.Weapon;

import java.util.ArrayList;

public abstract class Fighters extends Character implements IFightable{

    private ArrayList<Weapon> weapons;

    public Fighters(String name, int health, ArrayList<Item> inventory, ArrayList<Treasure> coinpurse, ArrayList<Weapon> weapons ) {
        super(name, health, inventory, coinpurse);
        this.weapons = new ArrayList<>();
    }
}
