package rover;

import java.util.*;

public class ListSensor implements Sensor {

  private Set<Point> points;

  public ListSensor(Point... obstacles) {
    this.points = new HashSet<Point>(Arrays.asList(obstacles));
  }
  
  public boolean obstacleOn(Point nextPosition) {
    return this.points.contains(nextPosition);
  }

}
