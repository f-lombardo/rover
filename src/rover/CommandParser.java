package rover;

public class CommandParser {

  private Sensor sensor;

  public CommandParser(Sensor sensor) {
    this.sensor = sensor;
  }
  
  public Command command(String commandString) {
    Parser[] parsers = {
      new StartingPositionParser(),
      new MoveParser(sensor),
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
