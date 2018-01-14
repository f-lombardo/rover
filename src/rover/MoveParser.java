package rover;

import rover.MoveCommand.Verse;

public class MoveParser implements Parser {

  public Command parse(String commandString) {
    if (commandString == null) {
      return null;
    }
    if (commandString.trim().toUpperCase().equals("F")) {
      return new MoveCommand(Verse.FORWARD);
    }
    if (commandString.trim().toUpperCase().equals("B")) {
      return new MoveCommand(Verse.BACKWARD);
    }
    return null;
  }

}
