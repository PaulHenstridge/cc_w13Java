package characters.magic;

import characters.Character;
import characters.IFightable;
import characters.creatures.Creature;
import items.Item;
import items.Spell;
import items.Treasure;


import java.util.ArrayList;

public abstract class MagicFolk extends Character implements IFightable {

    private ArrayList<Spell> spells;
    private ArrayList<Creature> homonculi;

    public MagicFolk(String name, int health, int damage, boolean isGood) {
        super(name, health, damage, isGood);
        this.spells = new ArrayList<>();
        this.homonculi = new ArrayList<>();
    }

    public void addCreature(Creature creature){
        homonculi.add(creature);
    }
}
