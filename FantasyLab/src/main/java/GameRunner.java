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

    public static void main(String[] args) {
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
        Room room2 = new TreasureRoom("Shitehole Cavern",false, treasure);
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room1);
        characterList.add(knight);
        characterList.add(cleric);
        characterList.add(warlock);
        warlock.addCreature(niceCreature);
        // create a new GameRunner instance and pass in the initial setup
        GameRunner game = new GameRunner(characterList, roomList, selectedCharacter);
        game.chooseCharacter();

        while (true) {
            Room currentRoom = game.roomList.get(counter);
            System.out.println("You are in " + currentRoom.getName() + " brave " + game.selectedCharacter.getName());
            System.out.println("Fierce creatures dwell here. Do you want to fight (f) or run away (r))?");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            if( "r".equalsIgnoreCase(choice)) {
                System.out.println("Running away is not an option, get on with it, bitch.");
            }
            if( "f".equalsIgnoreCase(choice)) {
                System.out.println(currentRoom.completeRoom(game.selectedCharacter));
            }
            if (currentRoom.isComplete) {
                counter++;
                if (counter < game.roomList.size()) {
                    currentRoom = game.roomList.get(counter);
                }
            }
            if (counter >= game.roomList.size()) {
                System.out.println("you have reached the final room, where you find a vending machine" );
                System.out.println("but the vending machine contains no chocolate, no crisps, only soft crackers and mouldy blue oranges.  You eat an orange and die.");
                System.out.println("THE END");
                break;
            }
        }
    }
    public void chooseCharacter() {
        System.out.println("Choose your character (1:knight, 2:Cleric, 3:Warlock)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        this.selectedCharacter = characterList.get(Integer.parseInt(choice)-1);
    }



    }

