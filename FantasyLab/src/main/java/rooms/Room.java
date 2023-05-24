package rooms;

import java.lang.reflect.Array;

public abstract class Room {
    String name;
    public boolean isComplete;

    public Room(String name, Boolean isComplete) {

        this.name = name;
        this.isComplete = isComplete;
    }

    public abstract String completeRoom();
}
