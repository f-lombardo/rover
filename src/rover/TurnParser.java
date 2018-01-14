package rover;

public class TurnParser implements Parser {

  public Command parse(String commandString) {
    if (commandString == null) {
      return null;
    }
    if (commandString.trim().toUpperCase().equals("L")) {
      return new TurnCommand(Rotation.LEFT);
    }
    if (commandString.trim().toUpperCase().equals("R")) {
      return new TurnCommand(Rotation.RIGHT);
    }
    return null;
  }

}
