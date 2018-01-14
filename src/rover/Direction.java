package rover;

public abstract class Direction {
  
  public final static Direction NORTH = new Direction("N", 0, 1) {
  };

  public final static Direction EAST = new Direction("E", 1, 0) {
  };
  
  public final static Direction SOUTH = new Direction("S", 0 , -1) {
  };
  public final static Direction WEST = new Direction("W", -1, 0) {
  };

  //////////////////////////////////
  protected final String id;

  protected int versorX;
  protected int versorY;
  
  private Direction(String id, int versorX, int versorY) {
    this.id = id;
    this.versorX = versorX;
    this.versorY = versorY;
  }
  
  public Position forward(int fromX, int fromY) {
    return new Position(fromX + versorX, fromY + versorY, this);
  }
  
  public Position backward(int fromX, int fromY) {
    return new Position(fromX - versorX, fromY - versorY, this);
  }
  
  public String toString() {
    return id;
  }
  
  public boolean equals(Object other) {
    if (!(other instanceof Direction)) {
      return false;
    }
    return ((Direction)other).id.equals(id);
  }
  
  public int hashCode() {
    return id.hashCode();
  }

}
