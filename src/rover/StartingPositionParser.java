package rover;



public class StartingPositionParser implements Parser {

  public Command parse(String commandString) {
    String[] tokens = split(commandString);
    if (tokens.length != 3) {
      return null;
    }
    Integer x = IntegerParser.parse(tokens[0]);
    Integer y = IntegerParser.parse(tokens[1]);
    Direction direction = DirectionParser.parse(tokens[2]);
    if (x != null && y != null && direction != null) {
      return new StartingPositionCommand(new Position(x, y, direction));
    }
    return null;
  }
  

  private String[] split(String commandString) {
    if (commandString == null) {
      return new String[0];
    }
    return commandString.split(",");
  }
}
