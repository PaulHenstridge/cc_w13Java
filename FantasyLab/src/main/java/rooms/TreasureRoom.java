package rooms;

import characters.Character;
import items.Item;
import items.Treasure;

import java.util.ArrayList;

public class TreasureRoom extends Room{

    Treasure treasure;
    public TreasureRoom(String name, Boolean isComplete, Treasure treasure) {
        super(name, isComplete);
        this.treasure = treasure;
    }

    @Override
    public String completeRoom(Character character) {
        this.isComplete = true;
        return character.fight();
    }
}
