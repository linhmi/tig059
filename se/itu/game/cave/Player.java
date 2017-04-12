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
  private Player(Room room) {
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
}
