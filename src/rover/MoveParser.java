package rover;

import rover.MoveCommand.Verse;

public class MoveParser implements Parser {

  private Sensor sensor;

  public MoveParser(Sensor sensor) {
    this.sensor = sensor;
  }
  
  public Command parse(String commandString) {
    if (commandString == null) {
      return null;
    }
    if (commandString.trim().toUpperCase().equals("F")) {
      return new MoveCommand(Verse.FORWARD, sensor);
    }
    if (commandString.trim().toUpperCase().equals("B")) {
      return new MoveCommand(Verse.BACKWARD, sensor);
    }
    return null;
  }

}
