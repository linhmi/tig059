package se.itu.game.cave;
import java.util.List  
import java.util.ArrayList
public class Player{
  private List<Thing> inventory;
  private Room currentRoom;
  private static Player player;
  
  /**
   * private constructor to prevent instantiation.
   */
  private Player(Room room) {  //constructor
    inventory = new ArrayList<Thing>();
    currentRoom = room;
  }
  /**
   * @return the one and only instance of Player.
   */
  public static Player getInstance() {
    if (player == null) {
      player = new Player(CaveInitializer.getInstance().getFirstRoom());
    }
    return player;
  }
  Player player = Player.getInstance();

  /**
   * Takes a thing (i e in a room) and puts in the inventory.
   * @param thing The Thing to take (pick up)
   */
  public void takeThing(Thing thing) {
    // Remove this things from the current room
    // Add this thing to the inventory
  }

  /**
   * Drop down a thing in the current room and remove it from the inventory.
   * @param thing the Thing to drop down.
   * @throws IllegalArgumentException if the Thing to remove is not present in the inventory.
   */
  public void dropThing(Thing thing) {
    // Check that we can drop this Thing, or
    //   throw a new IllegalArgumentException with messge
    // Remove this thing from the inventory
  }

  /**
'   * Return the player's inventory
   * @return the inventory
   */
  public List<Thing> inventory() {
    // return a reference to the player's inventory
    
    // (or if you are fancy, a copy of it or a
    //  view of it which cannot be modified)
    // The last thing is "extra for the ambitious"
  }

  /**
   * Returns the current Room.
   * @return the current room.
   */
  public Room currentRoom() {
    // return a reference to the Player's current Room
  }

  /**
   * Moves the player in given direction.
   * @param direction the direction in which to move the player.
   * @throws IllegalArgumentException - if the room in direction does not exist.
   */
  public void go(Direction direction) {
    // Ask the current Room for the Room in "direction" and save it
    // Check if the Room in that direction is null, and if so
    //  throw a new IllegalArgumentException with a message
    // If it wasn't null,
    //  change the Player's current Room to the Room above
  }

P3.6 toString() : String

  /**
   * Returns a String representation of the player<br>
   * on the form currentRoom: [the room to String] inventory: [the inventory]
   * @return a String representation of the player
   */
  public String toString() {
    // return a string with information about e.g.
    // the current room and the whole inventory.
  }

}
