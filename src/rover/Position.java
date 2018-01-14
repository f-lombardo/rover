package rover;

public class Position {

  private int x;
  private int y;
  private Direction direction;

  public Position(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }
  
  public String toString() {
    return "" + x + "," + y + "," + direction;
  }

  public Position forward() {
    return direction.forward(x, y);
  }

  public Position backward() {
    return direction.backward(x, y);
  }

  public Position turn(Rotation rotation) {
    return new Position(x, y, rotation.turn(direction));
  }

}
