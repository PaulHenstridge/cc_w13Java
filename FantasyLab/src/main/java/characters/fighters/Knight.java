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

    @Override
    public String fight(Character character) {
        return " I have smote you with my mighty weapon";
    }
}
