package rooms;

import characters.Character;

import java.lang.reflect.Array;

public abstract class Room {
    String name;
    public boolean isComplete;

    public Room(String name, Boolean isComplete) {

        this.name = name;
        this.isComplete = isComplete;
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public abstract String completeRoom(Character character);
}
