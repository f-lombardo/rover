package rover;

public abstract class Direction {

  
  public final static Direction NORTH = new Direction("N") {
    public Position forward(int x, int y) {
      return new Position(x, y+1, this);
    }
  };

  public final static Direction EAST = new Direction("E") {
    public Position forward(int x, int y) {
      return new Position(x+1, y, this);
    }
  };
  
  public final static Direction SOUTH = new Direction("S") {
    public Position forward(int x, int y) {
      return new Position(x, y - 1, this);
    }
  };
  public final static Direction WEST = new Direction("W") {
    public Position forward(int x, int y) {
      return new Position(x-1, y, this);
    }
  };

  private final String id;
  
  private Direction(String id) {
    this.id = id;
  }
  
  public abstract Position forward(int x, int y);
  
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
