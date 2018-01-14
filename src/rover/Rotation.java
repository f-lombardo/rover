package rover;

import static rover.Direction.*;

public enum Rotation {
  LEFT(){
    public Direction turn(Direction direction) {
      return directionsRing.before(direction);
    }
  },
  RIGHT{
    public Direction turn(Direction direction) {
      return directionsRing.after(direction);
    }
  };
  
  private final static Ring<Direction> directionsRing = new Ring<Direction>(NORTH, EAST, SOUTH, WEST);

  public abstract Direction turn(Direction direction);
}
