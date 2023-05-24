package rooms;

import items.Treasure;

import java.util.ArrayList;

public class TreasureRoom extends Room{

    Treasure treasure;
    public TreasureRoom(String name, Treasure treasure) {
        super(name);
        this.treasure = treasure;
    }

//    public void addTreasure(Treasure treasure){
//        this.treasures.add(treasure);
//    }
}
