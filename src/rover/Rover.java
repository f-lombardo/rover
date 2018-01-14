package rover;


public class Rover {

  private Position position = new Position(0, 0, Direction.NORTH);

  public Rover parse(String[] commands) {
    CommandParser commandParser = new CommandParser();
    for (String commandString : commands) {
      this.position = commandParser.command(commandString).executeFrom(this.position);
    }
    return this;
  }

  public String getPositionAsString() {
    return this.position.toString();
  }

}
