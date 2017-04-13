public class Room {

    /* 
       public static final int NORTH = 0;
       public static final int EAST  = 1;
       public static final int SOUTH = 2;
       public static final int WEST  = 3;
       
       Gött att slippa komma ihåg 0 betyder NORTH etc.
       Men int kan ha fler värden än 0..3 så vi använder enum istället
       
    */
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
