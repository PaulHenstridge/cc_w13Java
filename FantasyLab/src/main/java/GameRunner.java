import characters.Character;
import characters.creatures.Creature;
import characters.creatures.Ogre;
import characters.creatures.Troll;
import characters.fighters.Knight;
import characters.healers.Cleric;
import characters.magic.MagicFolk;
import characters.magic.Warlock;
import items.Item;
import items.Treasure;
import rooms.CreatureRoom;
import rooms.Room;
import rooms.TreasureRoom;

import java.util.ArrayList;
import java.util.Scanner;

public class GameRunner {
    ArrayList<Character> characterList;
    ArrayList<Room> roomList;
    Character selectedCharacter;

    public GameRunner(ArrayList<Character> characterList, ArrayList<Room> roomList, Character selectedCharacter) {
        this.characterList = characterList;
        this.roomList = roomList;
        this.selectedCharacter = selectedCharacter;
    }

    public void main(String[] args) {
        ArrayList<Character> characterList = new ArrayList<>();
        ArrayList<Room> roomList = new ArrayList<>();
        Character selectedCharacter = null;

        int counter = 0;
        ArrayList emptyInventory = new ArrayList<Item>();
        Character knight = new Knight("Barry the Knight", 100, 10, true);
        Character cleric = new Cleric("Derek the Cleric", 100, -10, true);
        MagicFolk warlock = new Warlock("Josh the Warlock", 100, 7, true);
        Creature niceCreature = new Ogre("Shrek", 100, 15, true);
        Creature prickCreature = new Troll("Parper", 100, 20, false);
        Treasure treasure = new Treasure("Gold", 40);
        Room room1 = new CreatureRoom("Lovely Room", false, prickCreature);
        Room room2 = new TreasureRoom("Shitehole Cavern",  treasure);
        roomList.add(room1);
        roomList.add(room2);
        characterList.add(knight);
        characterList.add(cleric);
        characterList.add(warlock);
        warlock.addCreature(niceCreature);
        chooseCharacter();

        while (true) {
            Room currentRoom = roomList.get(counter);
            System.out.println(currentRoom.completeRoom(selectedCharacter));
            if (currentRoom.isComplete) {
                counter++;
                currentRoom = roomList.get(counter);
            }
            if (counter >= roomList.size()) {
                break;
            }
        }

        public void chooseCharacter() {
            System.out.println("Choose your character (enter 0 - 2");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            this.selectedCharacter = characterList.get(Integer.parseInt(choice));
        }

    }}

