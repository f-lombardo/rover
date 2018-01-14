package rover;


public class MoveCommand implements Command {

  public enum Verse {
    FORWARD,
    BACKWARD
  }

  private Verse verse;
  private Sensor sensor;
  
  public MoveCommand(Verse verse, Sensor sensor) {
    this.verse = verse;
    this.sensor = sensor;
  }

  public Position executeFrom(Position position) {
    Position nextPosition = nextPosition(position);
    if (sensor.obstacleOn(nextPosition.getPoint())) {
      throw new CommandException("I can't go to " + nextPosition + " because I see an Obstacle");
    }
    return nextPosition;
  }

  private Position nextPosition(Position position) {
    switch (verse) {
      case FORWARD:
        return position.forward();
      
      case BACKWARD:
        return position.backward();
        
      default:
        throw new RuntimeException("Unknown verse: " + verse);
    }
  }

}
