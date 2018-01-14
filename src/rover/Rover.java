package rover;


public class Rover {

  public static final Position DEFAULT_STARTING_POSITION = new Position(new Point(0, 0), Direction.NORTH);

  private static final int DEFAULT_MAX_SIZE = 100;
  
  private Position position = DEFAULT_STARTING_POSITION;
  private int maxX = DEFAULT_MAX_SIZE;
  private int maxY = DEFAULT_MAX_SIZE;

  private Sensor sensor = Sensor.NULL;

  public Rover parse(String[] commands) {
    CommandParser commandParser = new CommandParser(sensor);
    for (String commandString : commands) {
      this.position =commandParser
                    .command(commandString)
                    .executeFrom(this.position)
                    .wrap(maxX, maxY);
    }
    return this;
  }

  public Rover setSensor(Sensor sensor) {
    this.sensor = sensor;
    return this;
  }
  
  public String getPositionAsString() {
    return this.position.toString();
  }

  public Rover setBorders(int maxX, int maxY) {
    this.maxX = maxX;
    this.maxY = maxY;
    return this;
  }

}
