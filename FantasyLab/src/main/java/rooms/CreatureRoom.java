package rooms;

import characters.creatures.Creature;
import characters.Character;
import java.util.ArrayList;

public class CreatureRoom extends Room{

    Creature creature;
    public CreatureRoom(String name, boolean isComplete, Creature creature) {
        super(name, isComplete);
        this.creature = creature;
    }

    @Override
    public String completeRoom(Character character) {
        this.isComplete = true;
        return character.fight();
    }

//    public void addCreature(Creature creature){
//        this.creature.add(creature);
//    }
}
