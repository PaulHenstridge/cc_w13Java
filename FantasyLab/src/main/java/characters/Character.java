package characters;

import items.Item;
import items.Treasure;

import java.sql.Array;
import java.util.ArrayList;

public abstract class Character {
    String name;
    int health;
    int damage;
    boolean isGood;
    ArrayList<Item> inventory;
    ArrayList<Treasure> coinpurse;
    Item currentItem;

    public Character(String name, int health, int damage, boolean isGood){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.isGood = isGood;
        this.inventory = new ArrayList<>();
        this.coinpurse = new ArrayList<>();
    }
    public void addItem(Item item){
        this.inventory.add(item);
    }

    public void addTreasure(Treasure treasure){
        this.coinpurse.add(treasure);
    }

    public void selectCurrentItem(int index){
        this.setCurrentItem(inventory.get(index));
    }

    public void setCurrentItem(Item currentItem) {
        this.currentItem = currentItem;
    }

    public boolean isGood() {
        return isGood;
    }
}
