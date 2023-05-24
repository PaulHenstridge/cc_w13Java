package characters;

import items.Item;
import items.Treasure;

import java.util.ArrayList;

public abstract class Character {
    String name;
    int health;
    ArrayList<Item> inventory;
    ArrayList<Treasure> coinpurse;

    public Character(String name, int health, ArrayList<Item> inventory, ArrayList<Treasure> coinpurse){
        this.name = name;
        this.health = health;
        this.inventory = inventory;
        this.coinpurse = coinpurse;
    }

}
