package characters.fighters;

import characters.Character;
import characters.IFightable;
import items.Item;
import items.Treasure;
import items.Weapon;

import java.util.ArrayList;

public abstract class Fighters extends Character implements IFightable {

    private ArrayList<Weapon> weapons;

    public Fighters(String name, int health, int damage, boolean isGood) {
        super(name, health, damage, isGood);
        this.weapons = new ArrayList<>();
    }
}
