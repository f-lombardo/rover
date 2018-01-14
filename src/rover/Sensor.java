package rover;

public interface Sensor {

  public Sensor NULL = new Sensor() {
    public boolean obstacleOn(Point nextPosition) {
      return false;
    }
  };

  public boolean obstacleOn(Point nextPosition);

}
