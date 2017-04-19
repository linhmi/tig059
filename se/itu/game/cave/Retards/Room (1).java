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


