package rover;

public class Point {

  private final int x;
  private final int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }
  
  public boolean equals(Object other) {
    if (!(other instanceof Point)) {
      return false;
    }
    Point otherPoint = (Point) other;
    return (x == otherPoint.x) && (y == otherPoint.y);
  }

  public int hashCode() {
    return x * 31 + y * 11;
  }
}
