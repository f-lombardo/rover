package rover;

public class MoveParser implements Parser {

  public Command parse(String commandString) {
    if (commandString == null) {
      return null;
    }
    if (commandString.trim().toUpperCase().equals("F")) {
      return new MoveCommand();
    }
    return null;
  }

}
