package rover;

import static rover.WrappedIndex.*;


public class Position {
  private Direction direction;
  private Point point;

  public Position(Point p, Direction direction) {
    this.point = p;
    this.direction = direction;
  }

  public String toString() {
    return "" + point.getX() + "," + point.getY() + "," + direction;
  }

  public Position forward() {
    return direction.forward(point.getX(), point.getY());
  }

  public Position backward() {
    return direction.backward(point.getX(), point.getY());
  }

  public Position turn(Rotation rotation) {
    return new Position(point, rotation.turn(direction));
  }

  public Position wrap(int maxX, int maxY) {
    int newX = wrappedIndex(point.getX(), maxX);
    int newY = wrappedIndex(point.getY(), maxY);
    if (point.getX() != newX || point.getY() != newY) {
      return new Position(new Point(newX, newY), direction);
    }
    return this;
  }

  public Point getPoint() {
    return this.point;
  }

}
