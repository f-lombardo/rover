package rover;

public class CommandParser {

  public Command command(String commandString) {
    Parser[] parsers = {
      new StartingPositionParser(),
      new MoveParser(),
      new TurnParser(),
    };
    
    for (Parser parser : parsers) {
      Command command = parser.parse(commandString);
      if (command != null) {
        return command;
      }
    }
    
    return new InvalidCommand(commandString);
  }

}
