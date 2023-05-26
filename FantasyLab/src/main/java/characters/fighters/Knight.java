package characters.fighters;

import characters.Character;
import items.Item;
import items.Treasure;
import items.Weapon;

import java.util.ArrayList;

public class Knight extends Fighters {
    public Knight(String name, int health, int damage, boolean isGood) {
        super(name, health, damage, isGood);
    }

    public String fight() {
        int rando = (int) Math.floor(Math.random() *(3 - 1 + 1) + 1);
         switch(rando){
            case 1:
                return " I have smote you with my mighty weapon";
            case 2:
                return " Whataa take that slime bitch!";
            case 3:
                return " I keel you!";
             default:
                 return "Unknown action";
        }

    }

}
