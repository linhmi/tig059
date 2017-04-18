import java.util.List;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Room {

    /* 
       public static final int NORTH = 0;
       public static final int EAST  = 1;
       public static final int SOUTH = 2;
       public static final int WEST  = 3;
       
       Gött att slippa komma ihåg 0 betyder NORTH etc.
       Men int kan ha fler värden än 0..3 så vi använder enum istället
       
    */
    private String description;
  private Room north;        
  private Room east;        
  private Room south;        
  private Room west;        
  private List<Thing> things;
    
    static enum Direction {
        NORTH,  /* automatiskt = 0 ... men det är ju skit samma!!!!*/
        EAST,
        SOUTH,
        WEST;
    }
    
    /* Kan användas så här:
          player.go(Room.Direction.NORTH);
       istället för:
          player.go(0);
      */
    
}
/*Hint: Collections has a utility method for making an unmodifiable
view of some list object. If we have a reference to e.g. a list,
we can do:
 list = getSomeList();
 List unmodifiableList = Collections.unmodifiableList(list);

The call on the second line creates an unmodifiableList from
the variable list.
*/
 public List<Thing> things() {
    // Return an unmodifialble view of the things list
  }
/*removeThing(thing : Thing) : Thing
Comment:
There are some checks to do here and some exceptions
to throw if the checks fails.

Why all the checks and exceptions?

We don't want it to be possible to try to remove
a thing which is not present in the room. And we
certainly don't want it to be possible to remove
a thing which is null from the room.

All of the above are errors in the game logic, so
we decided it is better to crash the game than to
permit it.
*/
  /**
   * Remove a Thing from the Room. For convenience reasons this
   * method returns the Thing to remove.
   * @param thing the Thing to remove.
   * @return the Thing to remove.
   * @throws IllegalArgumentException if the Thing to remove is not present in the Room.
   * @throws NullPointerException - if thing is null.
   */
  public Thing removeThing(Thing thing) {
    // Check if thing is null, and if so,
    //   throw a new NullPointerException with a message
    // If we can remove the thing from our things-list,
    //   remove it and return the thing.
    // Otherwise (we couldn't remove it), throw
    // a new IllegalArgumentException with a message.
  }

/*putThing(thing : Thing) : void

Comment: Same as above. We don't want to permit stupid things
like adding null to the room, or adding a thing which already
exists in the Room. Better to crash the program so that people
learn to do the right thing ;-)
*/
  /**
   * Add a Thing to the Room. For convenience reasons this method
   * returns the Thing added.
   * @param thing the Thing to add.
   * @throws NullPointerException - if thing is null.
   * @throws IllegalArgumentException - if thing already exists in list of things
   */
  public void putThing(Thing thing) {
    // IF the thing is null, throw a new NullPointerException
    //   with a message.
    // If we already have the Thing in the room, throw a new
    //   IllegalArgumentException with a message.
    // Otherwise, add the thing to the rooms list of things.
  }
//R4.4 getRoom(direction : Room.Direction) : Room

  /**
   * Returns the connecting Room in the given direction 
   * @param direction the direction of the room we want.
   * @return connecting Room in the given direction.
   */
  public Room getRoom(Direction direction) {
    // Use a switch-case or an if-else-if statement
    // to decide what room to return.
    // You know the direction from the parameter,
    // so you should simply decide which of your
    // instance variables of connecting Room:s to
    // return.
  }
//R4.5 description() : String

  /**
   * Returns the Room's description
   * @return the Room's description
   */
  public String description() {
      return description;
    // Return a String with the description for this Room
    // e.g. the instance variable holding this information.
  }    
//R4.6 toString() : String

  /**
   * Returns a String representatio of the Room
   * @return a String representatio of the Room
   */
  public String toString() {
       return this.description + "you have " + this.things + "in your bag";
    // Return a String describing this room.
    // Perhaps, the description and the list of things?
  }

 public Room(String description,
              Room north,        
              Room east,
              Room south,        
              Room west,
              List<Thing> things) {
    if ( description == null || things == null) {
      throw new NullPointerException("things or description can't be null.");
    }
    this.description=description;
    this.north=north;
    this.east=east;
    this.south=south;
    this.west=west;
    this.things=things;
  }
        //used when building the graph
    /**
   * @param direction The direction to Room
   * @param room The Room in direction
   */
 public void setConnectingRoom(Direction direction, Room room) {
    switch (direction) {
      case NORTH:
        north = room;
        break;
      case EAST:
        east = room;
        break;
      case SOUTH:
        south = room;
        break;
      case WEST:
        west = room;
        break;
      default: // This is actually a case where we can skip the default label!
        throw new IllegalArgumentException("Direction not corect, can't happen ;)");
    }
  }
